/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma=0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("ejemplo " + i);
            int numero = teclado.nextInt();
            suma=numero+suma;
            // incremento
            
        }
        
        System.out.printf("la suma total es %d %n",suma);
        double media=suma/10;
        System.out.printf("la media de todos los numeros es %.2f %n",media);
    }
}
