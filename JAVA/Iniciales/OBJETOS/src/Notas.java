import java.util.Scanner;

public class Notas {

    static double nota = 0.0;
    static Scanner consola = new Scanner(System.in);
    static String alumno;
    static String modulo;


    public static void main(String[] args) {
        System.out.println("***NOTAS ALUMNOS***");
        Scanner consola = new Scanner(System.in);
        Notas.notaAlumno();
        Notas.valor();
        Notas.not();
    }

    public static void notaAlumno() {
        System.out.print("Introduce el nombre alumno: ");
        alumno = consola.nextLine();
        System.out.print("Introduce el módulo: ");
        modulo = consola.nextLine();
        System.out.print("Introduce la nota: ");
        nota = consola.nextDouble();
        System.out.println("La nota de " + alumno + " en " + modulo + " es de " + nota);
    }

    public static void valor() {
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 || nota < 7) {
            System.out.println("Suficiente");
        } else if (nota > 9) {
            System.out.println("Sobresaliente");
        }
    }

    public static void not(){
        System.out.println("-------------------------------------------");
        System.out.println("Módulo de " + alumno.concat(": ") + modulo);
        System.out.println("Nota de " + alumno.concat(": ") + nota);
    }



}

