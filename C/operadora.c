#include <stdio.h>
#include <locale.h>

int minutos;
double valor;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a quantidade de minutos: ");
    scanf("%d", &minutos);

    if (minutos < 100) {
        valor = 50;
    }
    else {
        valor = 50 + ((minutos - 100) * 2);
    }

    printf("Valor a pagar: R$ %.2lf", valor);

}
