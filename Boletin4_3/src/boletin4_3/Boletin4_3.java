/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Barros
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo1=new Circulo();
        circulo1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca Radio")));
        System.out.println("El area es "+circulo1.calcArea());
        System.out.println("La longitud es "+circulo1.calcLonx());
    }
    
}
