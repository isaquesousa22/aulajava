EXERCICIO 1


package aula7.java;

import java.util.Scanner;
import java.util.Random;

public class Aula7Java {

    public static void main(String[] args) {
        Random ale = new Random();
        Scanner grava = new Scanner(System.in);
        
        String jg_a = null;
        String jg_b = null;
        int jogadas = 3;
        int num1_a = 0, num2_a = 0,num3_a = 0;
        int num1_b = 0, num2_b = 0, num3_b = 0;
        int cont=0;

        System.out.println("Nome do jogador A");
        jg_a = grava.next();
        
        System.out.println("Nome do jogador B");
        jg_b = grava.next();
        
       System.out.println("--------------------------");
       System.out.println("\n");
        
    
       while(cont<jogadas){
         
       System.out.println("Primeira Rodada");
       
        System.out.println("\n");
       
       num1_a = ale.nextInt(6);
       System.out.println(jg_a + " fez " + num1_a);
       
       num1_b = ale.nextInt(6);
       System.out.println(jg_b + " fez " + num1_b);
       
        System.out.println("--------------------------");
        System.out.println("\n");
        
        
       
       System.out.println("Segunda Rodada");
       
       System.out.println("\n");
       
       num2_a = ale.nextInt(6);
       System.out.println(jg_a + " fez " + num2_a);
       num2_b = ale.nextInt(6);
       System.out.println(jg_b + " fez " + num2_b);
       
       
        System.out.println("--------------------------");
       System.out.println("\n");
        
        
      
       System.out.println("Terceira Rodada");
       
       System.out.println("\n");
       
       num3_a = ale.nextInt(6);
       System.out.println(jg_a + " fez " + num3_a);
       num3_b = ale.nextInt(6);
       System.out.println(jg_b + " fez " + num3_b);
     
        System.out.println("--------------------------");
       
      break;
      
    
    
     }
     
      System.out.println("\n");
     
     int soma1 = num1_a + num2_a + num3_a;
     int soma2 = num1_b + num2_b + num3_b;
     
    
     if (soma1 > soma2){
         
         System.out.println(jg_a + " Ganhou de " + soma1 + " X " + soma2);
         
     }else if(soma1 < soma2) {
         
         System.out.println(jg_b + " Ganhou de " + soma2 + " X " + soma1);
         
     }else {
         
         System.out.println(jg_a + jg_b + " Empataram " + soma1 + " X " + soma2);
         
     }
     
       
     
       }
}
       