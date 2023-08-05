import java.util.Locale;
import java.util.Scanner;

public class soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int z = sc.nextInt();

        System.out.printf("SOMA = %d", x + z);

        sc.close();
    }
}
