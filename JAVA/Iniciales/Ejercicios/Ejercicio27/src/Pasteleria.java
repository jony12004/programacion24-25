import java.util.Locale;
import java.util.Scanner;

public class Pasteleria {
    static String sabor;
    static int precio = 0;
    static String tipoChocolate;
    static String tipoSabor;
    static boolean nata;
    static boolean nombre;

    static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** PASTELERIA ***");
        Pasteleria.leerDatos();

    }

    public static void leerDatos(){
        System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = consola.nextLine();
        System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
        tipoChocolate = consola.nextLine();
        System.out.println("¿Quiere nata?(si o no):");
        nata = consola.nextBoolean();
        System.out.println("¿Quiere ponerle un nombre?(si o no)");
        nombre = consola.nextBoolean();
    }


    
}
