/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.clase.dos.clases;

/**
 *
 * @author Myrka
 */
public abstract class Figura {

    private String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double calcularArea ();
    
    /*public double calcularArea (){
      return 0.0;
    }
*/
}
