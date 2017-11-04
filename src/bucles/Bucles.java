/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB17
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int stop= -1;  
      
      while(stop <= 0)//Mientras se cumpla esta condicion 
      {
          stop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      }
    }
    
}
