#include <stdio.h>
#include <locale.h>

double glicose;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a média da glicose: ");
    scanf("%lf", &glicose);

    if (glicose <= 100) {
        printf("Classificação: normal");
    }
    else if (glicose <= 140) {
        printf("Classificação: elevado");
    }
    else {
        printf("Classificação: diabetes");
    }

}
