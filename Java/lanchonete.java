import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Código do produto comprado: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double valor;
        switch (codigo) {
            case 1 -> {
                valor = quantidade * 5.0;
                System.out.printf("Valor a pagar: R$ %.2f", valor);
            }
            case 2 -> {
                valor = quantidade * 3.5;
                System.out.printf("Valor a pagar: R$ %.2f", valor);
            }
            case 3 -> {
                valor = quantidade * 4.8;
                System.out.printf("Valor a pagar: R$ %.2f", valor);
            }
            case 4 -> {
                valor = quantidade * 8.9;
                System.out.printf("Valor a pagar: R$ %.2f", valor);
            }
            case 5 -> {
                valor = quantidade * 7.32;
                System.out.printf("Valor a pagar: R$ %.2f", valor);
            }
        }

        sc.close();

    }
}
