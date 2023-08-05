import java.util.Locale;
import java.util.Scanner;

public class medidas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        double quadrado = a * a;
        double triangulo = a * b / 2;
        double trapezio = (a + b) * c / 2;

        System.out.printf("Area do quadrado = %.4f %n", quadrado);
        System.out.printf("Area do triângulo = %.4f %n", triangulo);
        System.out.printf("Area do trapézio = %.4f %n", trapezio);

        sc.close();

    }
}
