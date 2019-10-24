/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

import java.util.Scanner;


public class Adivina {
    public static void main(String[] args) {
        int aleatorio;
        int numero;
        int contador=0;
        Scanner teclado=new Scanner(System.in);
        aleatorio=(int) (Math.random()*20);
        
        System.out.println(aleatorio);

        do{
            System.out.println("introduce intento");
            numero=teclado.nextInt();
            contador++;
            
        }while(numero!=aleatorio);
        
        System.out.println("has adivinado el numero "+ contador);
    }
}
