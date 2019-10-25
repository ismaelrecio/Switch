
package swichybreak;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero del que quieres calcular su tabla");
        int numero=teclado.nextInt();
        
        for(int i=0; i<=10;i++){
            int resultado=numero*i;
            System.out.printf("%d * %d = %d %n",numero,i,resultado);
        }
                
                
    }
}
