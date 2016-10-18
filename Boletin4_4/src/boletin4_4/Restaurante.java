/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author Jose Barros
 */
public class Restaurante {
    private int polbo;
    private int patacas;

    public Restaurante() {
    }

    public Restaurante(int polbo, int patacas) {
        this.polbo = polbo;
        this.patacas = patacas;
    }

    public int amosarPolbo() {
        return polbo;
    }
    
    public int amosarPatacas() {
        return patacas;
    }

    public void engadirPolbo(int x){
        polbo=polbo+x;
    }
    public void engadirPatacas(int x){
        patacas=patacas+x;
    }
    public int calcClientes(){
        int clientes=0;
        if(polbo/2<=patacas/3){
            clientes=polbo/2;
        }
        if(patacas/3<=polbo/2){
        clientes=patacas/3;
    }
        return clientes;
    }
}
