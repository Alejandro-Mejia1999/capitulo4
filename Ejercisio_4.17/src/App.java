import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int x, ResulTK, ResulTL;
        ResulTK = 0;
        ResulTL = 0;
        float resul;

        Scanner entra = new Scanner(System.in);
        System.out.println("digite el numero de viajes realizados");
        x = entra.nextInt();
        float[] viaje = new float[x];
        int[] Km = new int[x];
        int[] Lt = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("cuantos kilometros en el viaje  " + i);
            Km[i] += entra.nextInt();
            System.out.println("cuantos litros en el viaje  " + i);
            Lt[i] += entra.nextInt();
            ResulTK += Km[i];
            ResulTL += Lt[i];
        }
        for (int j = 0; j < x; j++) {
            viaje[j] = Km[j] / Lt[j];
            System.out.println("\t\t\tEn el viaje " + j + " se consumio: " + viaje[j] + "Km/Lt");
        }
        resul = (ResulTK / ResulTL);
        System.out.println("\n\n\t\t\tel porsentaje de consumo total es: " + resul + "Km/Lt\n\n");
        entra.close();
    }
}
