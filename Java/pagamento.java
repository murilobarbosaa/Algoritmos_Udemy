import java.util.Locale;
import java.util.Scanner;

public class pagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        double valor = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();

        double pagamento = valor * horas;
        System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);

        sc.close();

    }
}
