#include <stdio.h>
#include <locale.h>

double x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite o valor de X: ");
    scanf("%lf", &x);
    printf("Digite o valor de Y: ");
    scanf("%lf", &y);

    if (x == 0 && y == 0) {
        printf("Origem\n");
    } else if (x == 0) {
        printf("Eixo Y\n");
    } else if (y == 0) {
        printf("Eixo X\n");
    } else if (x > 0 && y > 0) {
        printf("Q1\n");
    } else if (x < 0 && y > 0) {
        printf("Q2\n");
    } else if (x < 0 && y < 0) {
        printf("Q3\n");
    } else {
        printf("Q4\n");
    }

}
