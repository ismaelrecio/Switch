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
public class Dado2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de lanzamientos");
        int lanzamientos=teclado.nextInt();
        
        if(lanzamientos<0){
            for(int i=1;i<=100;i++){
                System.out.printf("tiradas %d: %d %n",i, (int) (Math.random()*6)+1 );
            }
            
        }
        
        for(int i=1;i<=lanzamientos;i++){
            System.out.printf("tiradas %d: %d %n",i,(int)(Math.random()*6)+1);
        }
    }
}
