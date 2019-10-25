
package swichybreak;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int factorial;
        System.out.println("Introduce el numero a calcular");
        factorial=teclado.nextInt();
        for(int i=factorial-1;i>=1;i--){
            factorial= factorial*i;
        }
        System.out.printf("El factorial es %d %n",factorial); 
               
    }
           
}
