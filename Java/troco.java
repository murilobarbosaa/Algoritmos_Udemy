import java.util.Locale;
import java.util.Scanner;

public class troco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        double troco = Math.abs(dinheiro - preco * quantidade);
        System.out.printf("Troco = %.2f", troco);

        sc.close();

    }
}
