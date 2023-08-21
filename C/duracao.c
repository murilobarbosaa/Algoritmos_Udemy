#include <stdio.h>

int total, resto, horas, minutos, segundos;

int main() {

    printf("Digite a duracao em segundos: ");
    scanf("%d", &total);

    horas = total / 3600;
    resto = total % 60;
    minutos = (total % 3600) / 60;
    segundos = resto % 60;

    printf("%d:%d:%d", horas, minutos, segundos);
}
