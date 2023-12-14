package finaltc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import finaltc.reglasParser.*;


public class miVisitor extends reglasBaseVisitor<String> {

    private int labelCount;
    private int tempCount;
    private String previousTemporal;
    private String currentTemporal;
    private String result;

    public miVisitor(){
        this.labelCount = 0;
        this.tempCount = 0;
        this.previousTemporal = "";
        this.currentTemporal = "";
        this.result = "";
    }


    //Listo
    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {

        if(ctx.asignar() != null){
            List<ParseTree> factor = getNodes(ctx, reglasParser.RULE_factor);
            if(factor.size() == 1){
                result += ctx.ID().getText() + " = " + factor.get(0).getText() + "\n";
            }else{    
                processExprLog(ctx.asignar().opal().exprLog());              
                result += ctx.ID().getText() + " = t" + (tempCount - 1) + "\n";
            }
        }
        return null;
    }
    

    @Override
    public String visitAsignacion(AsignacionContext ctx) {

        List<ParseTree> factor = getNodes(ctx, reglasParser.RULE_factor);

        if(factor.size() == 1){
            result += ctx.ID().getText() + " = " + factor.get(0).getText() + "\n";
        }else{          
            processExprLog(ctx.asignar().opal().exprLog());
            result += ctx.ID().getText() + " = t" + (tempCount - 1) + "\n"; 
        }
        
        return null;
    }


    @Override
    public String visitDefinicion_funcion(Definicion_funcionContext ctx){

        result += String.format("funcion comienza %s\n", ctx.ID().getText());
        visitChildren(ctx.bloque());
        result += String.format("%s termina\n", ctx.ID().getText());

        return null;
    }

    @Override
    public String visitFinalizar_con_return(Finalizar_con_returnContext ctx){      
        processExprLog(ctx.opal().exprLog());
        result += String.format("return %s\n", currentTemporal);
        return null;
    }

    
    @Override
    public String visitLlamada_funcion(Llamada_funcionContext ctx){
        if(ctx.argumentos_funcion().getChildCount() > 0){
           List<ParseTree> arguments = getNodes(ctx,reglasParser.RULE_opal);
           for(ParseTree a: arguments){
              processExprLog(((OpalContext)a).exprLog());
              result += String.format("param %s\n", currentTemporal);
            }
           result += String.format("t%s = call %s, %d\n", tempCount, ctx.ID().getText(), arguments.size());
        }else{
            result += String.format("t%d = call %s\n", tempCount, ctx.ID().getText());
        }
        tempCount++;
        return null;
    }

    @Override
    public String visitIif(IifContext ctx) {
        labelCount++;
        
        processExprLog(ctx.opal().exprLog());
        result += "ifnot " + currentTemporal + ", goto L" + labelCount + "\n";
        
        if(ctx.IElse() == null){
            visitChildren(ctx);
        }else{
            visitChildren((BloqueContext)ctx.getChild(4));
            int aux = labelCount;
            labelCount++;
            result += String.format("goto L%s\n", labelCount);
            result += String.format("L%s\n", aux);


             visitChildren((BloqueContext)ctx.getChild(6));
        }
        this.result += String.format("L%s\n", labelCount);
        return null;
    }


    private void concatTemps(String operation){
        this.result += String.format("t%d = %s %s %s \n", tempCount, previousTemporal, operation, currentTemporal);
        this.currentTemporal = "t" + tempCount;
        tempCount++;
    }

    @Override
    public String visitIwhile(IwhileContext ctx) {
        labelCount++;
        int aux = labelCount;

        result += String.format("L%s: \n", labelCount);
        labelCount++;
        processExprLog(ctx.opal().exprLog());
        result += String.format("ifnot %s, goto L%s\n", currentTemporal, labelCount);

        visitChildren(ctx);

        result += String.format("goto L%s\n", aux);
        result += String.format("L%s:\n", labelCount);

        return null;
    }

    @Override
    public String visitIfor(IforContext ctx) {
        labelCount++;
        visitAsignacion(ctx.asignacion(0));
        int aux = labelCount;

        result += String.format("L%s:\n", labelCount);
        processExprLog(ctx.opal(0).exprLog());
        labelCount++;
        result += String.format("ifnot %s, goto L%s\n", currentTemporal, labelCount);
        visitChildren(ctx.bloque());
        result += String.format("%s\n", ctx.opal(1).getText());
        result += String.format("goto L%s\n",aux);
        result += String.format("L%s:\n", labelCount);
        return null;
    }


    public void getNodesWithoutOpal(ParseTree t, int index, List<ParseTree> nodes) {
        if (t instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) t;
            if (ctx.getRuleIndex() == index) {
                nodes.add(t);
            }
        }
        for (int i = 0; i < t.getChildCount(); i++) {
            if (!(t.getChild(i) instanceof OpalContext)) {
                getNodesWithoutOpal(t.getChild(i), index, nodes);
            }
        }
    }


    private List<ParseTree> getNodes(ParseTree ctx, int ruleIndex) {
        return new ArrayList<ParseTree>(Trees.findAllRuleNodes(ctx, ruleIndex));
    }

 
    private void processExprLog(ExprLogContext ctx){
        List<ParseTree> expression = new ArrayList<ParseTree>();
        String temp;
      
        getNodesWithoutOpal(ctx, reglasParser.RULE_exprOR, expression);

        
        for(int i = 0; i < expression.size(); i++){
            temp = currentTemporal;
            processAnd((ExprORContext) expression.get(i));
            previousTemporal = temp;
            if(i > 0){
                concatTemps(expression.get(i).getParent().getChild(0).getText());
            }

        }

    }

    private void processAnd(ExprORContext ctx){
        List<ParseTree> expression = new ArrayList<ParseTree>();
        String temp;
      
        getNodesWithoutOpal(ctx, reglasParser.RULE_and, expression);

        
        for(int i = 0; i < expression.size(); i++){
            temp = currentTemporal;
            processComp((AndContext) expression.get(i));
            previousTemporal = temp;
            if(i > 0){
                concatTemps(expression.get(i).getParent().getChild(0).getText());
            }

        }
    }

    private void processComp(AndContext ctx){
        List<ParseTree> expression = new ArrayList<ParseTree>();
        String temp;
      
        getNodesWithoutOpal(ctx, reglasParser.RULE_comp, expression);

        
        for(int i = 0; i < expression.size(); i++){
            temp = currentTemporal;
            processExp((CompContext) expression.get(i));
            previousTemporal = temp;
            if(i > 0){
                concatTemps(expression.get(i).getParent().getChild(0).getText());
            }

        }

    }

    

    private void processExp(CompContext ctx){
        List<ParseTree> expression = new ArrayList<ParseTree>();
        String temp;
      
        getNodesWithoutOpal(ctx, reglasParser.RULE_exp, expression);

        
        for(int i = 0; i < expression.size(); i++){
            temp = currentTemporal;
            processTerm((ExpContext) expression.get(i));
            previousTemporal = temp;
            if(i > 0){
                concatTemps(expression.get(i).getParent().getChild(0).getText());
            }

        }
    }
    
    private void processTerm(ExpContext ctx){
        List<ParseTree> ruleTerms = new ArrayList<ParseTree>();
        String temp;
        getNodesWithoutOpal(ctx, reglasParser.RULE_term, ruleTerms);
        List<ParseTree> terms = new ArrayList<ParseTree>(ruleTerms);
  
        for(int i = 0; i < terms.size(); i++){
            List<ParseTree> factors = new ArrayList<ParseTree>();
            getNodesWithoutOpal(terms.get(i), reglasParser.RULE_factor, factors);
  
            if(factors.size() > 1){
                temp = currentTemporal;
                processFactors(factors);
                previousTemporal = temp;
                currentTemporal = "t" + (tempCount - 1);
            }else{
                previousTemporal = currentTemporal;
                 
                if(((TermContext)terms.get(i)).factor().exprLog() != null){
                    result += String.format("1\n");
                    temp = currentTemporal;
                    processExprLog(((TermContext)terms.get(i)).factor().exprLog());
                    previousTemporal = temp;
                }else if(((TermContext)terms.get(i)).factor().llamada_funcion() != null){
                    result += String.format("2\n");
                    temp = currentTemporal;
                    visitLlamada_funcion(((TermContext)terms.get(i)).factor().llamada_funcion());
                    previousTemporal = temp;
                    currentTemporal = "t" + (tempCount - 1);
                }else{
                    currentTemporal = factors.get(0).getText();
                }
            }

             if(i > 0){
                concatTemps(terms.get(i).getParent().getChild(0).getText());
             }
        }       
    }

    private void processFactors(List<ParseTree> factors){
        String temp;
        for(int i = 0; i < factors.size(); i++){
           previousTemporal = currentTemporal;

           if(((FactorContext)factors.get(i)).exprLog() != null){
             temp = currentTemporal;
             processExprLog(((FactorContext)factors.get(i)).exprLog());
             previousTemporal = temp;
           }else if(((FactorContext)factors.get(i)).llamada_funcion() != null){
              temp = currentTemporal;
              visitLlamada_funcion(((FactorContext)factors.get(i)).llamada_funcion());
              previousTemporal = temp;
              currentTemporal = "t" + (tempCount - 1);
           }else{
               previousTemporal = currentTemporal;
               currentTemporal = factors.get(i).getText();
           }
             
           if( i > 0){
            concatTemps(factors.get(i).getParent().getChild(0).getText());
           }
        }
    }

    public void printCode(){
        System.out.println("\n=== THREE ADDRESS CODE ===");
        System.out.println(this.result);
        this.printCodeToFile();
    }

    public void printCodeToFile(){
        try{
            PrintWriter out = new PrintWriter("intermediateCode.txt");
            out.println(this.result);
            out.close();
        }catch( FileNotFoundException e){
            System.out.print("Error saving intermediate code file: " + e.getMessage());
        }
    }

}
