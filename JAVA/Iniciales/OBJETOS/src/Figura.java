import java.util.Scanner;
//No hay necesidad de importar la clase MATH
public class Figura {

    // Definimos PI como una constante
    public static final double PI = 1.1416;
    // Flujo de datos y sobre el leere todas las variables
    public static Scanner consola = new Scanner(System.in);
    public static double area;

    public static void main(String[] args) {
        System.out.println("\n" + "*** FIGURAS ***" + "\n");
        Figura.pintarMenu();
        System.out.print("Introduzca la figura del area que quieras calcular: ");
        char respuesta;
        boolean continuar = true;
        int opcion = Figura.consola.nextInt();
        switch (opcion){
            case 1:
                Figura.area = Figura.areaCuadrado();
                System.out.println("El area del cuadrado es " + Figura.area);
                break;
            case 2:
                Figura.area = Figura.areaRectangulo();
                System.out.println("El area del rectangulo es " + Figura.area);
                break;
            case 3:
                Figura.area = Figura.areaTriangulo();
                System.out.println("El area del triangulo es " + Figura.area);
                break;
            case 4:
                Figura.area = Figura.areaCirculo();
                System.out.println("El area del circulo es " + Figura.area);
                break;
            case 5:
                Figura.area = Figura.areaPiramide();
                System.out.println("El area de la piramide es " + Figura.area);
                break;
            default:
                System.out.println("No exixte el area de esta figura");
                System.out.print("Desea continuar? ");
                respuesta = Figura.consola.nextLine().charAt(0);
        }
        System.out.println("Desea continuar? S/N? : ");
        respuesta = Figura.consola.next().charAt(0);
    }

    public static void pintarMenu(){
        System.out.println("*** MENU PRINCIPAL ***");
        System.out.println("1ºArea del Cuadrado");
        System.out.println("2ºArea del Rectangulo");
        System.out.println("3ºArea del Triangulo");
        System.out.println("4ºArea del Circulo");
        System.out.println("5ºArea de la Pirámide");
    }

    public static double areaRectangulo(){
        System.out.println("AREA RECTANGULO");
        System.out.print("Base del Rectangulo: ");
        double baseRectangulo = Figura.consola.nextDouble();
        System.out.print("Altura del Rectangulo: ");
        double alturaRectangulo = Figura.consola.nextDouble();
        return baseRectangulo*alturaRectangulo;
    }

    //void --> el metodo no devuelve nada
    public static double areaCuadrado(){
        System.out.println("AREA CUADRADO");
        System.out.print("Lado del Cuadrado: ");
        double lado = Figura.consola.nextDouble();
        return lado*lado;
    }

    public static double areaTriangulo(){
        System.out.println("AREA TRIANGULO");
        System.out.print("Base del Triángulo: ");
        double base = Figura.consola.nextDouble();
        System.out.print("Altura del Triángulo: ");
        double altura = Figura.consola.nextDouble();
        return base * altura / 2;
    }

    public static double areaCirculo(){
        System.out.println("AREA CIRCULO");
        System.out.print("Radio del círculo: ");
        double radio = Figura.consola.nextDouble();
        return Math.PI * radio * radio;
    }

    public static double areaPiramide(){
        System.out.println("AREA PIRÁMIDE");
        System.out.print("Base de la Pirámide: ");
        double basePiramide = Figura.consola.nextDouble();
        System.out.print("Altura de la Pirámide: ");
        double alturaPiramide = Figura.consola.nextDouble();
        double areaBase = basePiramide * basePiramide;
        double areaLateral = (basePiramide * alturaPiramide / 2) * 4;
        return areaBase + areaLateral;
    }

}