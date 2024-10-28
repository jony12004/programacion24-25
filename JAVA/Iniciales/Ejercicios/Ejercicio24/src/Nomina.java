import java.util.Scanner;

public class Nomina {
    static int opcion;
    static int puesto;
    static int diasViaje;
    static int estadoCivil;
    static double sueldo = 0;
    static double dietas = 0;
    static double porcentajeIRPF = 0;
    static Scanner consola = new Scanner(System.in);


    public static void main(String[] args) {
        // se dedica a orquestar= CONTROLAR 
        System.out.println("*** Nómina de Empleado ***");
        Nomina.empleado();
        Nomina.calcularSueldo();
        Nomina.finalSueldo();
    }
    public static void empleado() {
        System.out.print("1ºProgramador junior \n" + "2ºProgramador senior \n" + "3ºJefe del proyecto \n" +"Introduce el puesto de empleado: ");
        puesto = consola.nextInt();
        System.out.print("Cuántos dias ha estado de viaje visitando clientes? ");
        diasViaje = consola.nextInt();
        System.out.print("1 - Soltero\n" + "2 - Casado\n" + "Introduce su estado civil: ");
        estadoCivil = consola.nextInt();
    }

    public static void calcularSueldo(){
        switch (puesto){
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
            default:
                System.out.println("Cargo no válido");
        }
        dietas = diasViaje * 30;

        if (estadoCivil == 1){
            porcentajeIRPF = 0.25;
        }else if (estadoCivil == 2){
            porcentajeIRPF = 0.20;
        }
    }
    public static void finalSueldo(){
        double sueldobruto = sueldo + dietas;
        double retencion = sueldobruto * porcentajeIRPF;
        double sueldoNeto = sueldobruto - retencion;


        System.out.println("--------------------------------");
        System.out.println("| Sueldo base " + sueldo);
        System.out.println("| Dietas " + dietas);
        System.out.println("|-------------------------------|");
        System.out.println("| Sueldo bruto " + sueldobruto);
        System.out.println("| Retención IRPF (20%) " + retencion);
        System.out.println("|-------------------------------|");
        System.out.println("| Sueldo neto " + sueldoNeto);
    }




}
