import java.util.Locale;
import java.util.Scanner;

public class idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("");
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();

        sc.nextLine();

        System.out.printf("Dados da segunda pessoa: %n");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("");
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        double media = (double)(idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();

    }
}
