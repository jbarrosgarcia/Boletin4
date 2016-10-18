/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado1=new Scanner(System.in);
        Restaurante rest1=new Restaurante();
        System.out.println("Engadir kilos de patacas");
        rest1.engadirPatacas(teclado1.nextInt());
        System.out.println("Engadir kilos de polbo");
        rest1.engadirPolbo(teclado1.nextInt());
        System.out.println("El numero de clientes es "+rest1.calcClientes());
    }
    
}
