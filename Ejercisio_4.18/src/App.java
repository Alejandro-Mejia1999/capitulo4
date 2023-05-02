
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cuen, cuent, conta = 2021, num;
        float saldoI = 3000, TotalM = 0, TotalC = 5000, LimC = 2000;
        Scanner entra = new Scanner(System.in);
        int[] NumC = new int[5];
        for (int i = 0; i < 5; i++) {
            NumC[i] = conta;

            conta++;

        }
        int x = 1;
        while (x != 0) {
            System.out.print("\t\t\tIngrese su numero de cuenta\n");
            System.out.print("\t\t");
            cuen = entra.nextInt();
            for (int j = 0; j < 5; j++) {
                if (cuen == NumC[j]) {
                    if (cuen == NumC[0]) {
                        System.out.println("\t\t\tBIENVENIDO ADMINISTRADOR");
                        menuA();
                        num = entra.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("\t\tingresa la cuenta a revisar");
                                System.out.print("\t\t");
                                cuent = entra.nextInt();
                                for (int i = 1; i < 5; i++) {
                                    if (cuent == NumC[i]) {
                                        System.out.println("\t\tsaldo igual: " + saldoI);
                                        System.out.println("\t\ttotal de articulos cargados: " + TotalM);
                                        System.out.println("\t\tsaldo igual: " + TotalC);
                                        System.out.println("\t\tsaldo igual: " + LimC);

                                    }

                                }

                                break;
                            case 0:
                                break;
                        }
                    }
                    if (cuen != NumC[0])
                        System.out.println("cuenta correcta");

                }

            }
            System.err.println("desea ingresar una nueva cuenta");
            x = entra.nextInt();
        }
        entra.close();
    }

    public static void menuA() {
        System.out.println("que desea realizar");
        System.out.println("1. revisar cuentas");
        System.out.println("0.salir");

    }

    public static void info() {
        System.out.println("que desea realizar");
        System.out.println("1. saldo");
        System.out.println("");
    }
}
