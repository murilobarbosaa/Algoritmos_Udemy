#include <stdio.h>

char nome[50];
double valor, horas, total;

int main() {
    printf("Nome: ");
    scanf("%[^\n]", &nome);
    printf("Valor por hora: ");
    scanf("%lf", &valor);
    printf("Horas trabalhadas: ");
    scanf("%lf", &horas);

    total = valor * horas;
    printf("O pagamento para %s deve ser %.2lf", nome, total);
}
