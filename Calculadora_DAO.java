
package Controller;

import javax.swing.JOptionPane;


public class Calculadora_DAO {
    
        public static String x="";
        public static int valor1 = 0, valor2 = 0;
    
    public static void soma(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:  " );
         valor1 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor:  " );
        valor2 = Integer.parseInt(x);
             
        JOptionPane.showMessageDialog(null, "O resultado é " + (valor1 + valor2));
        
        
    }
       public static void sub(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:  " );
         valor1 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor:  " );
        valor2 = Integer.parseInt(x);
             
        JOptionPane.showMessageDialog(null, "O resultado é " + (valor1 - valor2));
        
        
    
        
        
    }
       
         public static void mult(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:  " );
         valor1 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor:  " );
        valor2 = Integer.parseInt(x);
             
        JOptionPane.showMessageDialog(null, "O resultado é " + (valor1 * valor2));
        
        
    }
           public static void div(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:  " );
         valor1 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor:  " );
        valor2 = Integer.parseInt(x);
             
        JOptionPane.showMessageDialog(null, "O resultado é " + (valor1 / valor2));
        
        
    }
}
