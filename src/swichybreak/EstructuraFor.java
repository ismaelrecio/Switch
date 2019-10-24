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
public class EstructuraFor {

    public static void main(String[] args) {
       int acumulador=0;
       int max=0;
       int min=0;
       
      
        Scanner teclado = new Scanner(System.in);

        //variable de inicio, variable final, incremento
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Dime numero %d %n",i);
            int numero = teclado.nextInt();
            acumulador += numero;
            if(numero>max){
                max=numero;
            }
            if(numero<min){
                min=numero;
            }
        }
        double media=acumulador/10;
        System.out.printf("La media es %.2f %n",media);
        System.out.printf("El max: %d %n",max);
        System.out.printf("El min: %d %n",min );
    }
}
// El numero mas grande introducido es:
//El numero mas pequeño introducido es
// la media de los numero introducidos es