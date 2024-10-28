import java.util.Scanner;

//Clase principal de un proyecto java, por convenio.
public class App {
    int valor = 10;
    //Una clase contiene propiedades y métodos.
    //Propiedades --> variables de una clase
    //Metodo --> funciones de una clase.


    /* metodo o función main() y es el punto de entrada a nuestro proyecto.
    En el metodo main() comienza la ejecución de la clase.
    */
    public static void main(String[] args) throws Exception {
        //Creación de variables dentro de un metodo.
        int valor = 5;
        double comision = 15.5;
        String nombre = "Jose Antonio ";
        String apellido = "Morgado"; // Clase String de java --> métodos
        String ciudad = "Almeria"; // tipo basico cadena de caracteres
        String nombreCompleto = nombre.concat(apellido);
        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("nombreCompleto.length() = " + nombreCompleto.length());
        System.out.println(("Vives en ").concat(ciudad));
        //mensaje de bienvenida por pantalla.
        /*System.out.printf("%20s %10s %10s\n", "Producto", "Cantidad", "Precio");
        System.out.printf("%20s %10d %10.2f\n","Pórtatil", 10, 1300.45);
        System.out.printf("%20s %10d %10.2f\n","Ipad", 5, 800.2);
        System.out.printf("%20s %10d %10.2f\n","Iphone", 40, 1500.5);
        System.out.printf("%20s %10d %10.2f\n","Samsung", 2, 1000.2);
        System.out.printf("%20s %10d %10.2f\n", "MacBook", 1, 850.4);
        /*
        System.out.printf("El valor de la comisión es del %.3f euros\n ", comision);
        System.out.printf("El valor de la comisión es del %10.5f euros \n ", comision);
        System.out.printf("El valor de la comisión es del %-10.4f euros ", comision);

        System.out.println("comision = " + comision);

        */
    }
    private void calcularPeso(){
            
    }
    private void calcularPotencia(){

    }
}

class Coche {

}