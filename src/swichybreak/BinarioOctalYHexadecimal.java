package swichybreak;

import java.util.Scanner;

public class BinarioOctalYHexadecimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int resto;
        String conversion = "";
        System.out.println("Introduce un numero en B10");
        numero = teclado.nextInt();

        /*do {
            resto = numero % 2;
            numero = numero / 2;
            conversion = resto + conversion;
            
        } while (numero != 1);
        System.out.println(numero+conversion);
         */
        do {
            resto = numero % 8;
            numero = numero / 8;
            conversion = resto + conversion;

        } while (numero > 7);
        System.out.println(numero + conversion);
    }
}
