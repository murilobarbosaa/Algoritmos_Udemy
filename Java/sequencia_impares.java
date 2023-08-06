import java.util.Locale;
import java.util.Scanner;

public class sequencia_impares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d %n", i);
            }
        }

        sc.close();

    }
}
