import java.util.Scanner;

public class CineCampa {
    public static int precioBase;
    public static String diaSemana;
    public static int numEntradas;
    public static char tarjetaCampa;
    public static double precioTotal;
    public static double precioGrupo;
    public static double descuento;
    public static double precioIndividual;
    public static int precioPareja ;
    public static Scanner consola = new Scanner(System.in);

    public static int numParejas;
    public static int numIndividual;


    public static void main(String[] args) {
        System.out.println("Precio de Cine Campa");
        CineCampa.entradaDatos();
        CineCampa.calcularPrecioGrupo();
        CineCampa.ImprimirTicket();
    }

    public static void entradaDatos(){
        System.out.println("Venta de entradas Campa");
        System.out.print("Número de entradas: ");
        numEntradas = consola.nextInt();
        System.out.print("Día de la semana: ");
        diaSemana = consola.next().toLowerCase();
        System.out.println("¿Tiene tarjeta de descuento? (s/n) ");
        CineCampa.tarjetaCampa = CineCampa.consola.next().toLowerCase().charAt(0);
    }

    public static void calcularPrecioBase(){
        precioBase = 8;
        if (CineCampa.diaSemana.equals("miercoles")){
            precioBase = 5;
        }
    }

    public static double calcularPrecioGrupo(){
        if (CineCampa.diaSemana.equals("jueves")){
            numParejas = numEntradas/2;
            numIndividual = numEntradas%2;
            precioPareja = numParejas * precioPareja;
        }else {
            numParejas = 0;
            numIndividual = numEntradas;
        }
        precioIndividual = numEntradas * precioBase;
        precioGrupo = precioPareja + precioIndividual;
        precioGrupo = precioGrupo; // se fija la propiedad
        return precioGrupo; // devuelve valor
    }

    public static double calcularDescuentoTarjeta(){

        if (tarjetaCampa == 's'){
            descuento = (CineCampa.calcularPrecioGrupo() * 0.10);
        }
        return descuento;
    }

    public static void calcularPrecioTotal(){

        precioTotal = calcularPrecioGrupo() - calcularDescuentoTarjeta();
    }

    public static void ImprimirTicket(){

        System.out.println("-----------------------------------------");
        System.out.println("Aqui tiene sus entradas. Gracias por su compra");

        if (CineCampa.diaSemana.equals("jueves") && CineCampa.numParejas >= 1){
            System.out.println("Entrada de Parejas " + CineCampa.numParejas);
            System.out.println("Precio por entrada de pareja " + CineCampa.precioPareja );
            if (CineCampa.numIndividual >= 1){
                System.out.println("Entradas Individuales " + CineCampa.numIndividual);
                System.out.println("Precio por entrada individual " + CineCampa.precioIndividual);
            }
        }else{
            System.out.println("Entradas Individuales " + CineCampa.numIndividual);
            System.out.println("Precio por entrada individual " + CineCampa.precioBase );
        }
        System.out.println("Total " + CineCampa.precioGrupo);
        System.out.println("Descuento " + CineCampa.descuento);
        System.out.println("A pagar " + CineCampa.precioTotal);
    }










}
