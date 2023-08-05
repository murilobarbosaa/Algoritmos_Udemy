import java.util.Locale;
import java.util.Scanner;

public class duracao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a duração em segundos: ");
        int total = sc.nextInt();

        int horas = total / 3600;
        int resto = total % 60;
        int minutos = (total % 3600) / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();

    }
}
