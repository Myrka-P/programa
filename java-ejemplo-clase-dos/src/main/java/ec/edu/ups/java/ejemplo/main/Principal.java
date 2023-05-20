/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.main;

import ec.edu.ups.java.ejemplo.clase.dos.clases.Circulo;
import ec.edu.ups.java.ejemplo.clase.dos.clases.Cuadrado;
//import ec.edu.ups.java.ejemplo.clase.dos.clases.Cuadrado;
import ec.edu.ups.java.ejemplo.clase.dos.clases.Figura;
//import ec.edu.ups.java.ejemplo.clase.dos.clases.Polimorfismo;
import ec.edu.ups.java.ejemplo.clase.dos.clases.Rectangulo;
import ec.edu.ups.java.ejemplo.clase.dos.clases.Triangulo;
//import ec.edu.ups.java.ejemplo.clase.dos.clases.Triangulo;

/**
 *
 * @author Myrka
 */
public class Principal {

    public static void main(String[] args) {
        
        Figura[] figura = new Figura[10];
        
        for (int i = 0; i < 10 ; i++) {
            double aleatorio = Math.random();
            if (aleatorio > 0.75){
                figura [i] = new Rectangulo(10, 10, "RECTANGULO");
            } else if (aleatorio > 0.50){
                figura[i] = new Circulo(5, "CIRCULO");
            }else if (aleatorio > 0.25){
                figura[i] = new Cuadrado(7, "CUADRADO0");
            }else{
                figura [i] = new Triangulo(10, 5, "TRIANGULO");
                
            }
           
            
        }
        for (int i = 0; i < 10 ; i++){
            
            System.out.println("TIPO DE FIGURA" + figura[i].getTipo());
            System.out.println("AREA "+ figura[i].calcularArea());
            System.out.println();
        
        
        
    }

        /* Triangulo t= new Triangulo(3.45,5.5 ,"Triangulo");
         Cuadrado c= new Cuadrado(4.4, "Cuadrado");
         
         Polimorfismo p= new Polimorfismo();
         p.polimorfismo(c);
         p.polimorfismo(t);
         
         System.out.println(c);
         System.out.println(t);
         System.out.println(p);
        
      
        
    }
   
    */
    }
    
}
