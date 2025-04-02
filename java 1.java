
package exercicio2;

import java.util.Scanner;


public class java {
    
    public static void main(String[] args){
    Scanner grava= new Scanner(System.in); 
    
    float s;
    System.out.println("Qual seu salário ?R$ " );
    s = grava.nextFloat(); 
    
    double dvt = s * 0.02;
    double sa =  s - dvt;
    double sal = sa * 0.06;
    double sala = s - sal;
    double salar = sala * 0.07;
    double salari  = s - salar;
    
    
     
     
    if (salari > 1200){
    double salario = salari * 0.15;
    System.out.println(salario);
     }else {
         System.out.println("Não é desconto " +  salari);
     }
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
