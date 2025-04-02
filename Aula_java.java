
package aula_java;

import java.util.Scanner;

public class Aula_java {

   
     
    public static void main(String[] args) {
       Scanner grava= new Scanner(System.in);   
       float vv ;
       System.out.println("VELOCIDADE permetida na via ? " );
        vv = grava.nextFloat(); 
       
       float vc;
       
      
       System.out.println("VELOCIDADE que o carro está no momento? " );
       vc = grava.nextFloat(); 
       
        float dif = vc - vv;
       
         
         
         
       if ( dif < 0){
       System.out.println("não leva multa");
       }else if( dif >= 1 && dif <= 10 ){
       System.out.println(" multa de R$80,00");
       }else if(dif >11 && dif <39 ){
        System.out.println("MULTA DE 120,00");
       }else{
        System.out.println("MULTA DE 200,00");
       }
    }
    } 
   
    

