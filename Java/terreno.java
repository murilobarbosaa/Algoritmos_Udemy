import java.util.Locale;
import java.util.Scanner;

public class terreno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double valor = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valor;

        System.out.printf("Área do terreno: %.2f %n", area);
        System.out.printf("Preço do terreno: %.2f %n", preco);

        sc.close();

    }
}
