import java.util.Locale;
import java.util.Scanner;

public class retangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = base * 2 + altura * 2;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Área = %.4f %n", area);
        System.out.printf("Perímetro = %.4f %n", perimetro);
        System.out.printf("Diagonal = %.4f %n", diagonal);

        sc.close();

    }
}
