/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;

public class SumarPositivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        int acumulador = 0;
        do {
            System.out.println("introduce un numero");
            numero = teclado.nextInt();
            acumulador = acumulador + numero;
        } while (numero != 0);
        System.out.printf("la suma de los numeros es %d %n",acumulador);
    } 

}
