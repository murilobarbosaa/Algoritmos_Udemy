import java.util.Locale;
import java.util.Scanner;

public class esperiencias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos casosde teste serão digitados? ");
        int casos = sc.nextInt();

        int total = 0, totalC = 0, totalR = 0, totalS = 0;
        double percentualC, percentualR, percentualS;

        for (int i = 0; i < casos; i++) {
            System.out.print("Quantidade de cobaias: ");
            int quantidade = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            char cobaia = sc.next().charAt(0);

            total += quantidade;

            if (cobaia == 'C') {
                totalC += quantidade;
            }
            else if (cobaia == 'R') {
                totalR += quantidade;
            }
            else if (cobaia == 'S') {
                totalS += quantidade;
            }
        }

        percentualC = (double)totalC / total * 100;
        percentualR = (double)totalR / total * 100;
        percentualS = (double)totalS / total * 100;

        System.out.printf("%n");
        System.out.printf("Relatório final: %n");
        System.out.printf("Total: %d cobaias %n", total);
        System.out.printf("Total de coelhos: %d %n", totalC);
        System.out.printf("Total de ratos: %d %n", totalR);
        System.out.printf("Total de sapos: %d %n", totalS);
        System.out.printf("Percentual de coelhos: %.2f %n", percentualC);
        System.out.printf("Percentual de ratos: %.2f %n", percentualR);
        System.out.printf("Percentual de sapos: %.2f %n", percentualS);

        sc.close();

    }
}
