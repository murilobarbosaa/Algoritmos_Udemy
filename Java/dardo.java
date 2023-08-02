import java.util.Locale;
import java.util.Scanner;

public class dardo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as três distâncias: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double maior = 0.0;

        if (x > y && x > z) {
            maior = x;
        }
        else if (y > x && y > z) {
            maior = y;
        }
        else {
            maior = z;
        }

        System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);

        sc.close();

    }
}
