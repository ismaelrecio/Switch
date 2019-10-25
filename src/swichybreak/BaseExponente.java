
package swichybreak;

import java.util.Scanner;

public class BaseExponente {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int base;
        int exp;
        int resultado;
        System.out.println("Introduce la base");
        base=teclado.nextInt();
        System.out.println("Introduce el exponente");
        exp=teclado.nextInt();
       
        if(exp==0 && base==0){
            System.out.println("Fallo, no se puede calcular");
        }else if (exp==0){
                System.out.printf("El resultado es %d %n",1);
                }else{
            resultado=base;
                for(int i= 1; i<exp;i++){
                resultado=resultado*base;
                }
                System.out.printf("El resultado es %d %n",resultado);
                }
               
    }
           
}