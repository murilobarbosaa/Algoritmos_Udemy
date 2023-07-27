#include <stdio.h>
#include <locale.h>
#include <math.h>

double a, b, c, delta, x1, x2;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Coeficiente a: ");
    scanf("%lf", &a);
    printf("Coeficiente b: ");
    scanf("%lf", &b);
    printf("Coeficiente c: ");
    scanf("%lf", &c);

    delta = b * b - 4 * a * c;

    if (delta < 0) {
        printf("A equa��o n�o possui ra�zes reais. \n");
    }
    else if (delta == 0) {
        x1 = - b / (2 * a);
        printf("A equa��o possui uma �nica ra�z real. \n");
        printf("X1 = %.4lf \n", x1);
    }
    else {
        x1 = (- b + sqrt(delta)) / (2 * a);
        x2 = (- b - sqrt(delta)) / (2 * a);
        printf("X1 = %.4lf \n", x1);
        printf("X2 = %.4lf \n", x2);
    }
}
