import java.util.Locale;
import java.util.Scanner;

public class glicose {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        String classificacao;

        if (glicose <= 100) {
            classificacao = "normal";
        }
        else if (glicose <= 140) {
            classificacao = "elevado";
        }
        else {
            classificacao = "diabetes";
        }

        System.out.printf("Classíficação: %s", classificacao);

        sc.close();

    }
}
