#include <stdio.h>
#include <locale.h>

double x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    do {
        printf("Digite as coordenadas X e Y (digite 0 para encerrar): ");
        scanf("%lf %lf", &x, &y);

        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                printf("Q1\n");
            } else if (x < 0 && y > 0) {
                printf("Q2\n");
            } else if (x < 0 && y < 0) {
                printf("Q3\n");
            } else if (x > 0 && y < 0) {
                printf("Q4\n");
            } else {
                printf("Origem\n");
            }
        }

    } while (x != 0 && y != 0);

}
