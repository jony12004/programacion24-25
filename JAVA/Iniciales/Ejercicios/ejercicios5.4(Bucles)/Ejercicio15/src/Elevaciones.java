import java.util.Scanner;

public class Elevaciones {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** Ejercicio 15 Elevaciones de numeros ***");
        System.out.print("Introduce el valor de la base: ");
        int base = Elevaciones.consola.nextInt();
        System.out.print("Introduce el valor del exponente: ");
        int exponenteN = Elevaciones.consola.nextInt();
         Elevaciones.exponente(exponenteN);
        Elevaciones.mostrarElevacion(base, exponenteN);
    }

    public static void exponente(int exponenteN) {
        for (int i = 1; i <= exponenteN; i++) {
            System.out.println(i);
        }
    }
    public static void mostrarElevacion(int base, int exponenteN){
        base = base^exponenteN;
        System.out.println(base);
    }
}
