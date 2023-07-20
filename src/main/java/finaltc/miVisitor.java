package finaltc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.TreeWizard.Visitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import finaltc.reglasParser.*;


public class miVisitor extends reglasBaseVisitor<String> {

    private int LabelCount;
    private int TemporalCount;
    private String previousTemporal;
    private String currentTemporal;
    private String code;
    private boolean addTemporal;


    public miVisitor(){
        this.LabelCount = 0;
        this.TemporalCount = 0;
        this.previousTemporal = "";
        this.currentTemporal = "";
        this.code = "";
        this.addTemporal = false;
    }


    private List<ParseTree> getNodes(ParseTree ctx, int ruleIndex) {
        return new ArrayList<ParseTree>(Trees.findAllRuleNodes(ctx, ruleIndex));
    }
/*
    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        List<ParseTree> factor = getNodes(ctx, reglasParser.RULE_factor);
        if ( factor.size() == 1){
            this.code += ctx.ID().getText() + " = " + factor.get(0).getText() + "\n";
        }
        return null;
    }
     */

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        System.out.println(ctx.lista_declaracion());
        if (ctx.lista_declaracion() != null){
            List<ParseTree> simple = getNodes(ctx, reglasParser.RULE_lista_declaracion);
           if (simple.size() != 0){
             this.code += ctx.ID().getText() + simple.get(0).getText() + "\n";
          }
        }
        return null;
    }

    public void printCode(){
        System.out.println("\n=== THREE ADDRESS CODE ===");
        System.out.println(this.code);
        this.printCodeToFile();
    }

    public void printCodeToFile(){
        try{
            PrintWriter out = new PrintWriter("intermediateCode.txt");
            out.println(this.code);
            out.close();
        }catch( FileNotFoundException e){
            System.out.print("Error saving intermediate code file: " + e.getMessage());
        }
    }

}
