#include <stdio.h>
#include <locale.h>

int x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos n�meros voc� vai digitar: ");
    scanf("%d", &x);

    for (int i = 0; i < x; i++) {
        printf("Digite um n�mero: ");
        scanf("%d", &y);

        if (y == 0) {
            printf("NULO \n");
        }
        else {
            if (y % 2 != 0) {
                if (y > 0) {
                    printf("�MPAR POSITIVO \n");
                }
                else {
                    printf("�MPAR NEGATIVO \n");
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
