#include <stdio.h>
#include <locale.h>

int casos;
double numerador, denominador, divisao;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos casos voc� vai digitar? ");
    scanf("%d", &casos);

    for (int i = 0; i < casos; i++) {
        printf("Entre com o numerador: ");
        scanf("%lf", &numerador);
        printf("Entre com o denominador: ");
        scanf("%lf", &denominador);

        if (numerador < 0) {
            printf("DIVIS�O IMPOSS�VEL \n");
        }
        else {
            divisao = numerador / denominador;
            printf("DIVIS�O = %.2lf \n", divisao);
        }
    }
}
