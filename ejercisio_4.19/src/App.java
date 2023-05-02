import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double art1, art2, art3, art4, Total, pago;
        int x, y;

        String vendedor;
        Scanner entra = new Scanner(System.in);
        art1 = 239.99;
        art2 = 129.75;
        art3 = 99.95;
        art4 = 350.89;
        Total = 0.0;
        System.out.println("digite el nombre del vendedor");
        vendedor = entra.next();
        System.out.println("cuantos articulos vendio: " + vendedor);
        x = entra.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("QUE ARTICULO COMPRO ");
            y = entra.nextInt();
            switch (y) {
                case 1:
                    Total += art1;

                    break;
                case 2:
                    Total += art2;

                    break;
                case 3:
                    Total += art3;

                    break;
                case 4:
                    Total += art4;

                    break;
                default:
                    System.out.println("el articulo no se encuentra");

            }

        }
        pago = 200 + (Total * 0.09);

        System.out.println("\t\t" + vendedor + "  vendio  un total: " + Total);
        System.out.println("\t\tTotal a pagar: " + pago);

        entra.close();
    }
}
