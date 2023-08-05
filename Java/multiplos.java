import java.util.Locale;
import java.util.Scanner;

public class multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite dois números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.print("São múltiplos");
        }
        else {
            System.out.print("Não são múltiplos");
        }

        sc.close();

    }
}
