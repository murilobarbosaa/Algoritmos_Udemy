#include <stdio.h>

double distancia, combustivel, consumo;

int main() {
    printf("Distancia percorrida: ");
    scanf("%lf", &distancia);
    printf("Combustivel gasto: ");
    scanf("%lf", &combustivel);

    consumo = distancia / combustivel;
    printf("Consumo medio = %.3lf", consumo);
}
