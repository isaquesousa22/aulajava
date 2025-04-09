EXERCICIO1


package aula8.java;

import java.util.Scanner;
import java.util.Random;

public class Aula8Java {

    public static void main(String[] args) {
     Scanner grava = new Scanner(System.in);
        
     int cont = 0, contv=0;
     
     System.out.println("Digite uma palavra: ");
     String pa = grava.next();
     
     while(cont!=1){
      if (pa == "aeiou"){
          contv++;
    
     } 
     cont++;

     }
     System.out.println("Quantidade de vogais é:  " + contv);
    }
}
     
    










EXERCICIO 2


package aula8.java;

import java.util.Scanner;
import java.util.Random;

public class Aula8Java {

    public static void main(String[] args) {
     int cont = 0;
     
     while(cont!= 5){
     
     cont++;
     if (cont == 1){
         System.out.println("*");
     }else if (cont == 2){
         System.out.println("**");
     }else if (cont == 3){
         System.out.println("***");
     }else if (cont == 4){
         System.out.println("****");
     }else if (cont == 5){
         System.out.println("*****");
     }else{
         System.out.println("Programa encerrado");
     }
     }
     }
     
       
     
     }














EXERCICIO 3


package aula8.java;

import java.util.Scanner;
import java.util.Random;

public class Aula8Java {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int cont=0,tb=0;
        System.out.println("Qual tabuada você deseja: ");
        tb = grava.nextInt();
        System.out.println("A Tabuada do número: " + tb);
        while(cont<10){
            cont++;
            
            
             System.out.println(tb + "x" + cont + "=" + tb*cont );
            
        
        
        
        }
      
 
     
 
     
       
     
       }
}