import java.util.Locale;
import java.util.Scanner;

public class crescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite dois números: ");
        int x = sc.nextInt();
        int z = sc.nextInt();

        while (x != z) {
            if (x > z) {
                System.out.printf("Decrescente! %n");
            }
            else {
                System.out.printf("Crescente! %n");
            }
            System.out.printf("Digite outros dois números: %n");
            x = sc.nextInt();
            z = sc.nextInt();
        }

        sc.close();
    }
}
