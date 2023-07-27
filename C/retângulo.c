#include <stdio.h>
#include <locale.h>
#include <math.h>

double base, altura;
double area = 0;
double perimetro = 0;
double diagonal = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Base do retângulo: ");
    scanf("%lf", &base);
    printf("Altura do retângulo: ");
    scanf("%lf", &altura);

    area = base * altura;
    perimetro = (base * 2) + (altura * 2);
    diagonal = sqrt((base * base) + (altura * altura));

    printf("AREA = %.4lf \n", area);
    printf("PERIMETRO = %.4lf \n", perimetro);
    printf("DIAGONAL = %.4lf \n", diagonal);
}
