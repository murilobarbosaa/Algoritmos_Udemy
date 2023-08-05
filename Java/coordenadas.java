import java.util.Locale;
import java.util.Scanner;

public class coordenadas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Valor de y: ");
        double y = sc.nextDouble();


        if (x == 0 && y == 0) {
            System.out.printf("Origem %n");
        } else if (x == 0) {
            System.out.printf("Eixo Y %n");
        } else if (y == 0) {
            System.out.printf("Eixo X %n");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1 %n");
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2 %n");
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3 %n");
        } else {
            System.out.printf("Q4 %n");
        }

        sc.close();

    }

}
