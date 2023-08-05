import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Hora inicial: ");
        int horaI = sc.nextInt();
        System.out.print("Hora final: ");
        int horaF = sc.nextInt();

        int duracao = 0;
        if (horaI > horaF) {
            duracao = 24 - horaI + horaF;
        }
        else if (horaF > horaI) {
            duracao = horaF - horaI;
        }
        else {
            duracao = 24;
        }

        System.out.printf("O jogo durou %d horas", duracao);

        sc.close();

    }
}
