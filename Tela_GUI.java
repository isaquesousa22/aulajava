
package View;

import javax.swing.JOptionPane;


public class Tela_GUI {
    
    public static void mostra(){
    
        String x = JOptionPane.showInputDialog(null,"1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");    
        int op = Integer.parseInt(x);
        
        switch(op){
            case 1:
               Controller.Calculadora_DAO.soma();
               break;
            case 2:
               Controller.Calculadora_DAO.sub();
               break;
            case 3:
               Controller.Calculadora_DAO.mult();
               break;
               
             case 4:
                Controller.Calculadora_DAO.div();
                break;
                
             default:
                 JOptionPane.showMessageDialog(null,"Opção inválida");
                 break;
                    
            
            
        }
    }
}
