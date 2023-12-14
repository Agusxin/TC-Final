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


ASIG : '=' ;
PYC : ';' ;
COMA : ',' ;

OR : '||' ;
AND : '&&' ;

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
              ;
 


/* FIN DECLARACION */

/* INICIO ASIGNACION */

asignar: ASIG opal;

asignacion : ID asignar ;

opal : exp ;

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
       | f PARENA opal PARENC
       | f llamada_funcion
       ;

f : MAS
  | MENOS
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

comp : opal logico_comp comp
     | opal comparacion comp
     | opal
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

pos_pre_incremento : ID MAS MAS 
                   | ID MENOS MENOS
                   | MAS MAS ID
                   | MENOS MENOS ID
                   ;



iwhile : WHILE PARENA comp PARENC bloque ;
  

iif : IIF PARENA comp PARENC bloque
    | IIF PARENA comp PARENC bloque IElse bloque 
    ;


ifor : IFOR PARENA asignacion PYC comp PYC pos_pre_incremento PARENC bloque ;

/* FIN ESTRUCTURAS DE CONTROL */


/* INICIO ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */


parametros_funcion : tipo_de_datos ID 
                   | tipo_de_datos ID COMA parametros_funcion
                   |
                   ; 

tipo_de_funcion : VOID | tipo_de_datos ;


definicion_funcion: tipo_de_funcion ID PARENA parametros_funcion PARENC bloque;


argumentos_funcion: opal COMA argumentos_funcion
                  | opal
                  |
                  ;

llamada_funcion: ID PARENA argumentos_funcion PARENC;
                  
                  

/* FIN ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */
 
finalizar_con_return : RETURN ( opal | )  ;
  
 