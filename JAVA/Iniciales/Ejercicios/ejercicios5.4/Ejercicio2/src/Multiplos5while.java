public class Multiplos5while {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio 2 Multiplos de 5 con while ***");
        Multiplos5while.multiplo5();
    }

    public static void multiplo5(){
        int i = 0;
        while (i <= 100){
            System.out.println(i);
            i+=5;
        }
    }
}
