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
public class Hexadecimal {
    public static void main(String[] args) {
        int numero = 134;
        int resto = 0;
        String letra = "";
        String conversion = "";
        while (numero>15){
            resto = numero%16;
            numero = numero/16;
            if(resto>9){
                switch (resto){
                    case 10:
                        letra = "A";
                        break;
                         case 11:
                        letra = "B";
                        break;
                         case 12:
                        letra = "C";
                        break;
                         case 13:
                        letra = "D";
                        break;
                }
            }
        }
        
    }
}
