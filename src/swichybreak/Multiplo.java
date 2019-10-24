package swichybreak;

import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        System.out.println("introuce numero1");
        int numero1 = teclado.nextInt();
        System.out.println("introduce numero2");
        int numero2 = teclado.nextInt();
        do {
            int multiplicación = numero2*numero;
            if (numero1%multiplicación == 0){
                System.out.printf("el numero %d es mcm %n",numero);
            }
            numero++;
        } while (numero < 101);

    }
}
