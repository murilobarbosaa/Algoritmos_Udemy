#include <stdio.h>
#include <locale.h>

double d1, d2, d3;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite as tr�s dist�ncias: \n");
    scanf("%lf", &d1);
    scanf("%lf", &d2);
    scanf("%lf", &d3);

    if (d1 > d2 && d1 > d3) {
        printf("MAIOR DIST�NCIA = %.2lf ", d1);
    }
    else if (d2 > d1 && d2 > d3) {
        printf("MAIOR DIST�NCIA = %.2lf ", d2);
    }
    else {
        printf("MAIOR DIST�NCIA = %.2lf ", d3);
    }

}
