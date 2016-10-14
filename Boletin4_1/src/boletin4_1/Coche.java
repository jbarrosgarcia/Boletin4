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
public class Coche {
    private int velocidad;
    public Coche(){
     velocidad =0 ;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public void acelerar(int valor){
        this.velocidad=this.velocidad+valor;
    }
    public void frenar(int menos){
        this.velocidad=this.velocidad-menos;
    }
    
}
