/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichybreak;

/**
 *
 * @author Usuario DAM 1
 */
public class Rango {

    public static void main(String[] args) {

        int resultado;
        for (int i = 3; i <= 7; i++) {
            System.out.printf("Tabla del %d %n", i);
            for (int x = 0; x <= 10; x++) {
                resultado = i * x;
                System.out.printf("%d*%d=%d %n", i, x, resultado);
            }
        }

    }
}
