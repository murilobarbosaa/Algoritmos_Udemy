import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();

        while (x != 0) {
            if (x % 2 != 0) {
                x++;
            }

            int soma = 5 * x + 20;
            System.out.printf("SOMA = %d\n", soma);

            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
        }

        sc.close();

    }
}
