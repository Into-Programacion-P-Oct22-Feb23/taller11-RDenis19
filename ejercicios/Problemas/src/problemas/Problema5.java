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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        int a = obtenerSuma(informacion);
        System.out.println(a);
    }

    public static int obtenerSuma(int[][] informacion) {
        int suma = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                suma = suma + informacion[fila][columna];
            }
        }

        return suma;
    }
    
}
//INTEGRANTES
//Denis Ruiz
//Steveen Cuenca