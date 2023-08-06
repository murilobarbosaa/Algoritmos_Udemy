import java.util.Locale;
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Deseja a tabuada para qual valor? ");
        int x = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", x, i, i * x);
        }

        sc.close();

    }
}
