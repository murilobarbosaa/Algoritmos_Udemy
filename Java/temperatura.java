import java.util.Locale;
import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        char resposta = sc.next().charAt(0);

        double fahrenheit;
        double celsius;

        if (resposta == 'F') {
            System.out.print("Digite a temperatura em fahrenheit: ");
            fahrenheit = sc.nextDouble();
            celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
        }
        else {
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);
        }

        sc.close();

    }
}
