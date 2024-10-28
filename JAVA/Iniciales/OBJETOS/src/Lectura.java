import java.util.Scanner;

public class Lectura {
    //Lectura es una clase estatica
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Introducir nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Introducir apellidos: ");
        var apellido = consola.nextLine();
        var nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.print("Introducir ciudad: ");
        var ciudad = consola.nextLine();
        System.out.print("Introducir edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Tu nombre completo es " + nombreCompleto);
        System.out.println("Tu ciudad es " + ciudad);
        System.out.println("Tu edad es " + edad);
        //Llamar o invocar al metodo estatico esMayor()
        //esMayor(edad);
        Lectura.esMayor(edad);
        Lectura.getAnioNac(edad);
    }

    public static void esMayor(int edad) {
        //metodo estatico de clase Lectura para saber si es o no mayor de edad
        if (edad >= 18) {
            System.out.println("Con la edad de " + edad + " años eres Mayor de edad");
        } else {
            System.out.println("Con la edad de " + edad + " años eres Menor de edad");
        }
    }

    public static void getAnioNac(int edad) {
        int AnioAct = 2024;
        var AnioNac = AnioAct - edad;
        System.out.println("Nacistes en " + AnioNac);
    }
}

