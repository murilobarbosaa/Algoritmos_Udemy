import java.util.Locale;
import java.util.Scanner;

public class consumo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Distância percorrida: ");
        int distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumo = (double) distancia / combustivel;
        System.out.printf("Consumo médio = %.3f", consumo);

        sc.close();

    }
}
