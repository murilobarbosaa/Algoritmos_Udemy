import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int casos = sc.nextInt();

        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < casos; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                dentro++;
            }
            else {
                fora++;
            }
        }

        System.out.printf("%d Dentro %n", dentro);
        System.out.printf("%d Fora %n", fora);

        sc.close();

    }
}
