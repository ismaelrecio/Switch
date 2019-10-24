/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;


public class MayorNumero {

    public static void main(String[] args) {
        int aleatorio;
        int maximo = 0;
        do {
            aleatorio = (int) (Math.random() * 100);
            if (aleatorio != 0) {
                System.out.println(aleatorio);
            }
            if (aleatorio > maximo) {
                maximo = aleatorio;
            }
        } while (aleatorio != 0);
        
        System.out.println(maximo);
        

    }
}
