grammar reglas;

@header {
package finaltc;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;

PARENA : '(' ;
PARENC : ')' ;


INT : 'int' ;
DOUBLE : 'double' ;
VOID : 'void' ;
FLOAT : 'float' ;

WHILE : 'while' ;
IIF : 'if' ;
IElse : 'else';
IFOR : 'for' ;

MAS : '+' ;
MENOS : '-' ;
MULT: '*' ;
DIV : '/' ;


MENOR : '<' ; 
MAYOR : '>' ;
MENORIGUAL : '<=' ;
MAYORIGUAL : '>=' ;
IGUALES: '==' ;
DISTINTO : '!=' ;

INCREMENTO : '++';
DECREMENTO: '--';


ASIG : '=' ;
PYC : ';' ;
COMA : ',' ;

OR : '||' ;
AND : '&&' ;
NOT : '!';
TRUE : 'true';
FALSE : 'false';

RETURN : 'return' ;

ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_') * ;

WS : [ \n\t\r]+ -> skip;

programa :  instrucciones;


instrucciones :  instruccion instrucciones
              |  bloque instrucciones
              |
              ;

bloque : LLAVEA instrucciones LLAVEC ;


instruccion : declaracion PYC
            | asignacion PYC
            | iwhile
            | iif
            | ifor
            | definicion_funcion
            | llamada_funcion PYC
            | finalizar_con_return PYC
            ;


/*  INICIO DECLARACION  */
declaracion :  tipo_de_datos ID
            |  tipo_de_datos ID asignar
            ;
            


tipo_de_datos : INT 
              | DOUBLE 
              | FLOAT
              | VOID
              ;
 


/* FIN DECLARACION */

/* INICIO ASIGNACION */

asignar: ASIG opal;

asignacion : ID asignar ;

opal: exprLog
    ;

exprLog: exprOR
       |
       ;

exprOR : and o 
       ;

o : OR and o
  |
  ;

and : comp a
    ;

a : AND comp a
  |
  ;

comp : exp c
     ;

c: comparacion exp
 |
 ;



exp : term e ;

e : MAS   term e
  | MENOS term e
  |
  ;

term : factor t ;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : f ID
       | f ENTERO
       | f PARENA exprLog PARENC
       | f llamada_funcion
       | ID f
       ;

f : MAS
  | MENOS
  | NOT
  | INCREMENTO
  | DECREMENTO
  |
  ;
  


/* FIN ASIGNACION */


/* INICIO ESTRUCTURAS DE CONTROL */

logico_comp : OR 
            | AND
            ;

comparacion : MAYOR
            | MENOR 
            | MAYORIGUAL 
            | MENORIGUAL 
            | IGUALES 
            | DISTINTO 
            ;


  
//bloque_estructuras_de_control : verificador comparacion verificador bloque_estructuras_de_control
//                              | PARENA comp comparacion verificador  bloque_estructuras_de_control
//                              | PARENA comp bloque_estructuras_de_control
//                              | PARENC comparacion verificador bloque_estructuras_de_control
//                              | PARENC logico_comp bloque_estructuras_de_control
//                              | PARENC
//                              | logico_comp bloque_estructuras_de_control
//                              |
//                              ; 



iwhile : WHILE PARENA opal PARENC bloque ;
  

iif : IIF PARENA opal PARENC bloque
    | IIF PARENA opal PARENC bloque IElse bloque 
    ;


ifor : IFOR PARENA asignacion PYC opal PYC (asignacion | opal) PARENC bloque ;

/* FIN ESTRUCTURAS DE CONTROL */


/* INICIO ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */


parametros_funcion : tipo_de_datos ID 
                   | tipo_de_datos ID COMA parametros_funcion
                   |
                   ; 


definicion_funcion: tipo_de_datos ID PARENA parametros_funcion PARENC bloque;


argumentos_funcion: opal COMA argumentos_funcion
                  | opal
                  |
                  ;

llamada_funcion: ID PARENA argumentos_funcion PARENC;
                  
                  

/* FIN ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */
 
finalizar_con_return : RETURN ( opal | )  ;
  
 