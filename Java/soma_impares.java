import java.util.Locale;
import java.util.Scanner;

public class soma_impares {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Digite dois números: %n");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int troca;
        int soma = 0;

        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.printf("Soma dos ímpares = %d", soma);

        sc.close();

    }
}
