
package swichybreak;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Dado {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2=teclado.nextInt();
        
        for(int i=num1; i<=num2; i++){
            int resto=i%2;
            if(resto==0){
                System.out.printf("El numero %d es par %n",i);
                
            }
                    
        }
    }
}
