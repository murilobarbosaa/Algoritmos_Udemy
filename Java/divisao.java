import java.util.Locale;
import java.util.Scanner;

public class divisao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos casos você vai digitar? ");
        int casos = sc.nextInt();

        double numerador;
        double denominador;
        double divisao = 0;

        for (int i = 0; i < casos; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextDouble();
            if (numerador < 0) {
                System.out.printf("Divisão Impossível %n");
            }
            else {
                divisao = numerador / denominador;
            }
            System.out.printf("Divisão = %.2f %n", divisao);
        }

        sc.close();

    }
}
