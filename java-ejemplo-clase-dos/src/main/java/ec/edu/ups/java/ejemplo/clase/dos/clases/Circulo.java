/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.clase.dos.clases;

/**
 *
 * @author Myrka
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String tipo) {
        super(tipo);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
   // public Circulo (double r ){
     //   radio = r;
    //}
   // public double area(){
     //   return Math.PI * radio * radio;
    //}

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    
}
