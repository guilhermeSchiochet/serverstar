/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora007;
import javax.swing.*;
/**
 *
 * @author guilherme.schiochet
 */
public class Calculadora007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
      String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
      //transfomando os Strings em Inteiros
      double a = Double.parseDouble(numA);
      double b = Double.parseDouble(numB);
      //calculando
      double soma = a + b;
      double sub = a - b;
      double mult = a * b;
      double div = a / b;
      //mostrando o resultado das quatro operações básicas
      JOptionPane.showMessageDialog(null,
            "Soma: " + soma + "\n" +
            "Subtração: " + sub + "\n" +
            "Multiplicação: " + mult + "\n" +
            "Divisão: " + div
      );
   }
}
        
                
        
        
        
        
        
    
    

