#include <stdio.h>

double raio, area;

int main() {
    printf("Digite o valor do raio do circulo: ");
    scanf("%lf", &raio);

    area = raio * raio * 3.1415926535;
    printf("AREA = %.3lf", area);
}
