/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author Jose Barros
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche1=new Coche();
        coche1.acelerar(50);
        System.out.println("Vamos a "+coche1.getVelocidad()+" kms hora");
        coche1.frenar(20);
        System.out.println("Frenaste asi que ahora\nVamos a "+coche1.getVelocidad()+" kms hora");
    }
    
}
