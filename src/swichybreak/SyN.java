/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class SyN {

    public static void main(String[] args) {
        int aleatorio;
        int numero;
        int contador = 0;
        aleatorio = 0;
        int record = 9999;
        String opcion;
        boolean comparacion;
        Scanner teclado = new Scanner(System.in);

        System.out.println(aleatorio);

        do {
            System.out.printf("El record esta en: %d %n", record);
            contador = 0;
            aleatorio = (int) (Math.random() * 10);

            do {
                System.out.println("introduce intento");
                numero = teclado.nextInt();
                contador++;

            } while (numero != aleatorio);

            System.out.printf("el numero lo has acertado en %d intentos %n ", contador);
            if (contador < record) {
                System.out.println("Has superado el record");
                record = contador;

            }
            System.out.println("Quieres volver a jugar (S/N)");
            opcion = teclado.next();
        } while (opcion.toUpperCase().equals("S"));
        System.out.println("Has salido del juego");
    }
}