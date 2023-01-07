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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion;
        int cedula;
        System.out.println("~Ingrese 1 si para obtener el valor de la luz"
                + "\n" + "~Ingrese 2 para calcular el valor del predio");
        opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la cedula del cliente");
        cedula = entrada.nextInt();
        if (opcion == 1) {
            calcularPlanilla(nombre, cedula);            
        }
        if (opcion == 2) {
            calcularPredio(nombre, cedula);                       
        }        
    }
    public static void calcularPlanilla(String a, int b){
        Scanner entrada = new Scanner(System.in);
        double valor;
        double consumo;
        double planilla;
        System.out.println("Ingrese el consumo de los Kilovatios");
        consumo = entrada.nextDouble();
        System.out.println("Ingrese el valor Kilovatios por hora");
        valor = entrada.nextDouble();
        planilla = valor * consumo;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Cliente %s con cedula %d debe cancelar el valor de: "
                + "$%.1f\n", a, b, planilla);
        
    }
    public static void calcularPredio(String a, int b){
        Scanner entrada = new Scanner(System.in);
        double bien;
        double predio;
        System.out.println("Ingrese el valor del inmueble:");
        bien = entrada.nextDouble();
        predio = bien * 0.2;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Cliente %s con cedula %d tiene un bien y mueble "
                + "valorado en $%.0f y tiene que pagar de predio "
                + "$%.0f\n", a, b, bien, predio);
    }
}
//INTEGRANTES
//Denis Ruiz
//Steveen Cuenca