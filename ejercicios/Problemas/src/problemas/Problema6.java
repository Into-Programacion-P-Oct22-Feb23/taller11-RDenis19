/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
     public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = obtenerMedia(informacion);
        double desviacion = obtenerDesviacion(informacion, media);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Valor de la media es: %.2f\n", media);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Valor de la desviacion es: %.2f\n", 
                desviacion);
    }
    
    public static double obtenerMedia(int [] arreglo){
        int suma = 0;
        double media;
        for(int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        media =  suma / arreglo.length;
        return media;
    }
    
    public static double obtenerDesviacion(int [] arreglo, double media){
        double rango;
        double varianza = 0;
        double desviacion;
        
        for(int i = 0; i < arreglo.length; i++){
            rango = Math.pow(arreglo[i] - media, 2);
            varianza = varianza + rango;
        }
        
        varianza = varianza / arreglo.length;
        desviacion = Math.sqrt(varianza);
        
        return desviacion;
    }
}
//INTEGRANTES
//Denis Ruiz
//Steveen Cuenca    

