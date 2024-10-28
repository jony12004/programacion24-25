import javax.swing.*;
import java.util.Scanner;

public class FigurasMorgado {
    public static final double PI = 3.1416;
    public static Scanner entrada = new Scanner(System.in);
    public static double area;


    public static void main(String[] args) {

        System.out.println("\n" + "*** FIGURAS ***" + "\n");

        // switch (opcion) {
        //     case 1:
        //         FigurasMorgado.area = FigurasMorgado.calcularAreaCuadrado();
        //         System.out.println("El área del Cuadrado es = " + FigurasMorgado.area + " m2");
        //         break;
        //     case 2:
        //         FigurasMorgado.area = FigurasMorgado.calcularAreaRectangulo();
        //         System.out.println("El area del rectangulo es = " + FigurasMorgado.area + " m2" + "\n");
        //         break;
        //     case 3:
        //         FigurasMorgado.area = FigurasMorgado.calcularAreaTriangulo();
        //         System.out.println("El área del triángulo es: " + FigurasMorgado.area + " m2" + "\n");
        //         break;
        //     case 4:
        //         FigurasMorgado.area = FigurasMorgado.calcularAreaCirculo();
        //         System.out.println("El área del circulo es: " + FigurasMorgado.area + " m2" + "\n");
        //         break;
        //     case 5:
        //         FigurasMorgado.area = FigurasMorgado.calcularAreaPiramide();
        //         System.out.println("El área de la pirámide es: " + FigurasMorgado.area + " m2" + "\n");
        //         break;
        //     default:
        //         System.out.println("No existe el área de esta Figura");

        // }
        // System.out.println("Figura" + figuras + ": " + nombreDeFigura);

        // FigurasMorgado.area = FigurasMorgado.calcularAreaCuadrado();
        // System.out.println("El area del cuadrado es = " + FigurasMorgado.area + " m2" + "\n");

        // FigurasMorgado.area = FigurasMorgado.calcularAreaRectangulo();
        // System.out.println("El area del rectangulo es = " + FigurasMorgado.area + " m2" + "\n");

        // FigurasMorgado.area = FigurasMorgado.calcularAreaTriangulo();
        // System.out.println("El área del triángulo es: " + FigurasMorgado.area + " m2" + "\n");

        // FigurasMorgado.area = FigurasMorgado.calcularAreaCirculo();
        // System.out.println("El área del circulo es: " + FigurasMorgado.area + " m2" + "\n");

        // FigurasMorgado.area = FigurasMorgado.calcularAreaPiramide();
        // System.out.println("El área de la pirámide es: " + FigurasMorgado.area + " m2" + "\n");


    }
    public static void MenuSwitch(){
        int opcion;
        char respuesta;
        boolean continuar = false;
        while (continuar){
            Figura.pintarMenu();
            opcion = FigurasMorgado.entrada.nextInt();
            switch (opcion){
                case 1:
                    FigurasMorgado.area = FigurasMorgado.calcularAreaCuadrado();
                    System.out.println("El área del Cuadrado es = " + FigurasMorgado.area + " m2");
                    break;
                case 2:
                    FigurasMorgado.area = FigurasMorgado.calcularAreaRectangulo();
                    System.out.println("El area del rectangulo es = " + FigurasMorgado.area + " m2" + "\n");
                    break;
                case 3:
                    FigurasMorgado.area = FigurasMorgado.calcularAreaTriangulo();
                    System.out.println("El area del rectangulo es = " + FigurasMorgado.area + " m2" + "\n");
                    break;
                case 4:
                    FigurasMorgado.area = FigurasMorgado.calcularAreaCirculo();
                    System.out.println("El área del circulo es: " + FigurasMorgado.area + " m2" + "\n");
                    break;
                case 5:
                    FigurasMorgado.area = FigurasMorgado.calcularAreaPiramide();
                    System.out.println("El área de la pirámide es: " + FigurasMorgado.area + " m2" + "\n");
                    break;
                default:
                    System.out.println("No existe dicha figura");
            }//switch
            System.out.println("¿Desea continuar S/N?: ");
            respuesta = FigurasMorgado.entrada.next().toUpperCase().charAt(0);
            //if ((respuesta == 'N') && (respuesta == 'n')) //or and
            if (respuesta == 'N') {
                continuar = false;
            }
        }//while
    }

    public static void Menuif(){
        int opcion;
        char respuesta;
        boolean continuar = true;


        while (continuar) {
            FigurasMorgado.pintarMenu();
            System.out.print("Introduzca el número de la figura que quiera calcular: ");
            opcion = FigurasMorgado.entrada.nextInt();

            if (opcion == 1) {
                FigurasMorgado.area = FigurasMorgado.calcularAreaCuadrado();
                System.out.println("El área del Cuadrado es = " + FigurasMorgado.area + " m2");
            }else if (opcion == 2) {
                FigurasMorgado.area = FigurasMorgado.calcularAreaRectangulo();
                System.out.println("El area del rectangulo es = " + FigurasMorgado.area + " m2" + "\n");
            }else if (opcion == 3) {
                FigurasMorgado.area = FigurasMorgado.calcularAreaTriangulo();
                System.out.println("El área del triángulo es: " + FigurasMorgado.area + " m2" + "\n");
            }else if (opcion == 4) {
                FigurasMorgado.area = FigurasMorgado.calcularAreaCirculo();
                System.out.println("El área del circulo es: " + FigurasMorgado.area + " m2" + "\n");
            }else if (opcion == 5){
                FigurasMorgado.area = FigurasMorgado.calcularAreaPiramide();
                System.out.println("El área de la pirámide es: " + FigurasMorgado.area + " m2" + "\n");
            }else {
                System.out.println("Opción no válida");
            }

            System.out.println("¿Desea continuar S/N?: ");
            respuesta = FigurasMorgado.entrada.next().toUpperCase().charAt(0);
            //if ((respuesta == 'N') && (respuesta == 'n')) //or and
            if (respuesta == 'N') {
                continuar = false;
            }
        }
    }

    public static void pintarMenu(){
        System.out.println("Menú Principal");
        System.out.println("-------------------");
        System.out.println("1-. Área del Cuadrado");
        System.out.println("2-. Área del Rectángulo");
        System.out.println("3-. Área del Triángulo");
        System.out.println("4-. Área del Circulo");
        System.out.println("5-. Área de la Pirámide \n");

    }

    public static double calcularAreaCuadrado() {
        System.out.println("\n AREA CUADRADO");
        System.out.print("Introduce el lado del cuadrado:");
        double lado = FigurasMorgado.entrada.nextDouble();
        return lado * lado;
    }

    public static double calcularAreaRectangulo() {
        System.out.println("\n AREA RECTÁNGULO");
        System.out.print("Introduce el lado1 del rectángulo:");
        double lado1 = FigurasMorgado.entrada.nextDouble();
        System.out.print("Introduce el lado2 del rectángulo:");
        double lado2 = FigurasMorgado.entrada.nextDouble();
        return lado1 * lado2;
    }

    public static double calcularAreaTriangulo() {
        System.out.println("\n AREA TRIÁNGULO");
        System.out.print("Introduce la base del triángulo:");
        double base = FigurasMorgado.entrada.nextDouble();
        System.out.print("Introduce la altura del triángulo:");
        double altura = FigurasMorgado.entrada.nextDouble();
        return base * altura / 2;

    }

    public static double calcularAreaCirculo() {
        System.out.println("\n AREA CIRCULO");
        System.out.print("Introduce el radio del círculo:");
        double radio = FigurasMorgado.entrada.nextDouble();
        return FigurasMorgado.PI *radio*radio;
    }

    public static double calcularAreaPiramide() {
        System.out.println("\n AREA PIRAMIDE");
        System.out.print("Introduce la base de la pirámide:");
        double base = FigurasMorgado.entrada.nextDouble();
        System.out.print("Introduce la altura de la pirámide:");
        double altura = FigurasMorgado.entrada.nextDouble();
        double areaBase = base * base;
        double areaLateral = (base * altura / 2) * 4;
        return areaBase + areaLateral;
    }
}