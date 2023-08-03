#include <stdio.h>
#include <locale.h>

int casos, quantidade, total, totalC, totalR, totalS;
char cobaia;
double percentualC, percentualR, percentualS;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos casos de teste serão digitados? ");
    scanf("%d", &casos);

    for (int i = 0; i < casos; i++) {
        printf("Quantidade de cobaias: ");
        scanf("%d", &quantidade);
        printf("Tipo de cobaia: ");
        scanf("%s", &cobaia);

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

    printf("\n");
    printf("RELATORIO FINAL: \n");
    printf("Total: %d cobaias \n", total);
    printf("Total de coelhos: %d \n", totalC);
    printf("Total de ratos: %d \n", totalR);
    printf("Total de sapos: %d \n", totalS);
    printf("Percentual de coelhos: %.2lf \n", percentualC);
    printf("Percentual de ratos: %.2lf \n", percentualR);
    printf("Percentual de sapos: %.2lf \n", percentualS);

}
