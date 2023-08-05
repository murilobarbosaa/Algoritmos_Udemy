import java.util.Locale;
import java.util.Scanner;

public class circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double area = raio * raio * 3.141592;
        System.out.printf("Área = %.3f", area);

        sc.close();

    }
}
