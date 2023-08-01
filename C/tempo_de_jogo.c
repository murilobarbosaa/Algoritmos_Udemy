#include <stdio.h>
#include <locale.h>

int horaI, horaF, duracao;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Hora inicial: ");
    scanf("%d", &horaI);
    printf("Hora final: ");
    scanf("%d", &horaF);

    if (horaI > horaF) {
        duracao = 24 - horaI + horaF;
    }
    else if (horaI < horaF) {
        duracao = horaF - horaI;
    }
    else {
        duracao = 24;
    }

    printf("O JOGO DUROU %d HORA(S)", duracao);

}
