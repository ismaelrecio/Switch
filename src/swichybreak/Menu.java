/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcionSalida = "e";
        String opcion;
        do {
            System.out.println("Bienvenido al menu");
            System.out.println("A. Opción 1");
            System.out.println("B. Opción 2");
            System.out.println("C. Opción 3");
            System.out.println("D. Opción 4");
            System.out.println("E. salir");

            System.out.println("Introduce la opción deseada");
            opcion = teclado.next();

            switch (opcion) {
                case "a":
                    System.out.println("La opción seleccionada es A");
                    System.out.println("Accediendo a Menú General");
                    System.out.println("");
                case "b":
                    System.out.println("La opción seleccionada es A");
                    System.out.println("Accediendo a Menú General");
                    System.out.println("");
                case "c":
                    System.out.println("La opción seleccionada es A");
                    System.out.println("Accediendo a Menú General");
                    System.out.println("");
                case "d":
                    System.out.println("La opción seleccionada es A");
                    System.out.println("Accediendo a Menú General");
                    System.out.println("");
                case "e":
                    System.out.println("La opción seleccionada es A");
                    System.out.println("Accediendo a Menú General");
                    System.out.println("");
                default:
                    System.out.println("La opcion no contemplada");
                    System.out.println("Introduce una letra");
                    opcion = teclado.next();
            }
        } while (!opcion.equalsIgnoreCase(opcionSalida));

    }

}
