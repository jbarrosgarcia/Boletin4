/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;
import java.math.*;
/**
 *
 * @author Jose Barros
 */
public class Circulo {
    private double radio;
    private final double PI=3.14d;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcArea(){
        double area=Math.pow(radio, 2);
        return area;
    }
    public double calcLonx(){
        double lonxitude=2*PI*radio;
        return lonxitude;
    }
}
