import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos casos você vai digitar? ");
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Digite três números: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double media = ((x * 2) + (y * 3) + (z * 5)) / 10;
            System.out.printf("Media = %.1f %n", media);
        }

        sc.close();

    }
}
