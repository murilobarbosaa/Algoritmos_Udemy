import java.util.Locale;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            if (x == 0) {
                System.out.printf("Nulo %n");
            }
            else if (x % 2 != 0) {
                System.out.print("Ímpar ");
                if (x > 0) {
                    System.out.printf("Positivo %n");
                }
                else {
                    System.out.printf("Negativo %n");
                }
            }
            else {
                System.out.print("Par ");
                if (x > 0) {
                    System.out.printf("Positivo %n");
                }
                else {
                    System.out.printf("Negativo %n");
                }
            }
        }

        sc.close();

    }
}
