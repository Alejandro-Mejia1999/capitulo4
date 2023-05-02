import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int lado;
        Scanner entra = new Scanner(System.in);
        System.out.println("ingrese el lado del cuadrado");
        lado = entra.nextInt();
        if (lado >= 1 && lado <= 20) {
            // Linea superior
            for (int i = 0; i < lado; i++) {
                System.out.print(" * ");
            }
            System.out.println();

            // centro de la forma
            for (int i = 0; i < lado - 2; i++) {
                System.out.print(" * ");
                for (int j = 0; j < lado - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("     * ");
            }

            // Linea inferior
            for (int i = 0; i < lado; i++) {
                System.out.print(" * ");
            }
        } else {
            System.out.println("error numero no esta dentro del limite");
        }

        entra.close();
    }
}
