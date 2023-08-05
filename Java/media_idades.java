import java.util.Locale;
import java.util.Scanner;

public class media_idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite as idades: ");
        int idade = sc.nextInt();

        int soma = 0;
        int cont = 0;

        if (idade < 0) {
            System.out.print("Impossível calcular");
        }
        else {
            while (idade > 0) {
                soma += idade;
                cont++;
                idade = sc.nextInt();
            }
            double media = (double)soma / cont;
            System.out.printf("Media = %.2f", media);
        }

        sc.close();

    }
}
