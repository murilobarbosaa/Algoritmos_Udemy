#include <stdio.h>
#include <locale.h>

int x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos números você vai digitar: ");
    scanf("%d", &x);

    for (int i = 0; i < x; i++) {
        printf("Digite um número: ");
        scanf("%d", &y);

        if (y == 0) {
            printf("NULO \n");
        }
        else {
            if (y % 2 != 0) {
                if (y > 0) {
                    printf("ÍMPAR POSITIVO \n");
                }
                else {
                    printf("ÍMPAR NEGATIVO \n");
                }
            }
            else {
                if (y > 0) {
                    printf("PAR POSITOVO \n");
                }
                else {
                    printf("PAR NEGATIVO \n");
                }
            }
        }
    }
}
