/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;

        System.out.println("Ingrese nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese nota 4");
        n4 = entrada.nextDouble();

        obtenerPromedioCualitativo(n1, n2, n3, n4);
    }

    public static void obtenerPromedioCualitativo(double a, double b,
            double c, double d) {
        double promedio;
        promedio = (a + b + c + d) / 4;
        if (promedio >= 0 && promedio <= 5){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("El promedio de las notas: %.1f, %.1f, %.1f, %.1f "
                    + "es Regular\n", a ,b ,c ,d);
        }
        if (promedio >= 5.1 && promedio <= 8){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("El promedio de las notas: %.1f, %.1f, %.1f, %.1f "
                    + "es Bueno\n", a ,b ,c ,d);
        }
        if (promedio >= 8.1 && promedio <= 9){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("El promedio de las notas: %.1f, %.1f, %.1f, %.1f "
                    + "es Muy Bueno\n", a ,b ,c ,d);
        }
        if (promedio >= 9.1 && promedio <= 10){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("El promedio de las notas: %.1f, %.1f, %.1f, %.1f "
                    + "es Sobresaliente\n", a ,b ,c ,d);
        }
    }  

}
