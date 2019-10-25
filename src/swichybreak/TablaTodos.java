package swichybreak;

public class TablaTodos {

    public static void main(String[] args) {

        int resultado;
        for (int i = 0; i <= 10; i++) {

            System.out.printf("Tabla del %d %n", i);
            for (int x = 0; x <= 10; x++) {
                resultado = i * x;
                System.out.printf(" %d * %d = %d %n", i, x, resultado);
            }
        }

    }
}
