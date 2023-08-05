import java.util.Locale;
import java.util.Scanner;

public class combustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
        int codigo = sc.nextInt();

        int a = 0, g = 0, d = 0;

        while (codigo != 4) {
            if (codigo == 1) {
                a++;
            }
            else if (codigo == 2) {
                g++;
            }
            else if (codigo == 3){
                d++;
            }
            System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO %n");
        System.out.printf("Álcool: %d %n", a);
        System.out.printf("Gasolina: %d %n", g);
        System.out.printf("Diesel: %d", d);

        sc.close();

    }
}
