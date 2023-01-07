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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("~Ingrese 1 para obtener el"
                + " area de un cuadrado" + "\n" + "~Ingrese 2 para obtener el "
                + "area de un triangulo" + "\n" + "~Ingrese 3 para obtener el "
                + "area de un rectangulo");
        numero = entrada.nextInt();
        if (numero == 1 ) {
            obtenerAreaCuadrado();
        }
        if(numero == 2){
            obtenerAreaTriangulo();
        }
        if(numero == 3){
            obtenerAreaRectangulo();
        }
    }
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Area del cuadrado es: %.2f\n", area);
    }
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        double altura;
        double area;
        double base;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Area del cuadrado es: %.2f\n", area);
    }
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Area del cuadrado es: %.2f\n", area);
    }

}
//INTEGRANTES
//Denis Ruiz
//Steveen Cuenca