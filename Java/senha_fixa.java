import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int senha = 2002;

        System.out.print("Digite a senha: ");
        int tentativa = sc.nextInt();

        while (tentativa != senha) {
            System.out.print("Senha Inválida! Tente novamente: ");
            tentativa = sc.nextInt();
        }

        System.out.print("Acceso permitido!");

        sc.close();

    }
}
