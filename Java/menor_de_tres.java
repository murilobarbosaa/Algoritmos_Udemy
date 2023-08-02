import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int x = sc.nextInt();
        System.out.print("Segundo valor: ");
        int y = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int z = sc.nextInt();

        int menor = 0;

        if (x < y && x < z) {
            menor = x;
        }
        else if (y < x && y < z) {
            menor = y;
        }
        else {
            menor = z;
        }

        System.out.print("MENOR = " + menor);

        sc.close();

    }
}
