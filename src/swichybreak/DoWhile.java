
package swichybreak;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int veces = 6;
        double acumulador = 0;
        Scanner teclado = new Scanner(System.in);
      do{
          //tareas repetitivas
          //pedir nota, comprobar, sumarla
          System.out.println("Introduce la nota de la asignatura");
          double nota = teclado.nextDouble();
          if(nota<0.0 || nota>10){
              nota=0.0;
          }
          acumulador = acumulador + nota;
          
          //modifico el valor de veces
          veces--;
      } while(veces>0);
        System.out.printf("La media del ciclo es %.2f",acumulador/6);
    }
}
