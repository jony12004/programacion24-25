import java.util.Scanner;

public class Persona {
    // propiedades a nivel de clase son accesibles a todos los metodos de esta clase
    public static String nombre1;
    public static String nombre2;
    public static int edad1;
    public static int edad2;
    Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        // en la var, cadena almacena la lectura por consola ---> Flujo de datos
        // nombre1, nombre2, edad1, edad2 : se declaran a nivel de metodo
        // Al valor de estas solo se accede en el metodo main
        Scanner consola = new Scanner(System.in); //flujo de datos y sobre él leere todas las variables
        System.out.print("Nombre Persona1: ");
        Persona.nombre1 = consola.nextLine();
//      nombre1 = Persona.nombre1
        //String nombre1 = consola.nextLine();
        System.out.print("Edad de " + nombre1 + ": ");
        Persona.edad1 = Integer.parseInt(consola.nextLine());
        System.out.print("Nombre Persona2: ");
        Persona.nombre2 = consola.nextLine();
        System.out.print("Edad de " + nombre2 + ":");
        Persona.edad2 = Integer.parseInt(consola.nextLine());
        Persona.personaMayorq();
    }
    public static void personaMayorq(){
        if (edad1 > edad2){
            System.out.println(nombre1 + " es mayor que " + nombre2);
        }else if (edad1 == edad2){
            System.out.println(nombre1 + " tiene la misma edad " + nombre2);
        }else System.out.println(nombre2 + " es mayor que " + nombre1);
    }

    public static void nombreAlumno(String alumno, Scanner consola){
        System.out.println("Introduce el nombre alumno: ");
        alumno = consola.nextLine();
        System.out.println("Introduce el módulo: ");
    }




}
