import java.util.Locale;
import java.util.Scanner;

public class aumento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();

        double novoSalario = 0, aumento = 0;
        int porcentagem = 0;

        if (salario <= 1000) {
            novoSalario = salario * 0.2 + salario;
            aumento = salario * 0.2;
            porcentagem = 20;
        }
        else if (salario <= 3000) {
            novoSalario = salario * 0.15 + salario;
            aumento = salario * 0.15;
            porcentagem = 15;
        }
        else if (salario <= 8000) {
            novoSalario = salario * 0.1 + salario;
            aumento = salario * 0.1;
            porcentagem = 10;
        }
        else {
            novoSalario = salario * 0.05 + salario;
            aumento = salario * 0.05;
            porcentagem = 5;
        }

        System.out.printf("Novo salário = R$ %.2f %n", novoSalario);
        System.out.printf("Aumento = R$ %.2f %n", aumento);
        System.out.printf("Porcentagem = %d %%", porcentagem);

        sc.close();

    }
}
