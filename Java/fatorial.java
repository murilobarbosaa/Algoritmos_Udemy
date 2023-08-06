import java.util.Locale;
import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial = fatorial * i;
        }
        System.out.printf("Fatorial = %d", fatorial);

        sc.close();
    }
}
