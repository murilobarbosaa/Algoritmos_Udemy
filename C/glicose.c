#include <stdio.h>
#include <locale.h>

double glicose;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a m�dia da glicose: ");
    scanf("%lf", &glicose);

    if (glicose <= 100) {
        printf("Classifica��o: normal");
    }
    else if (glicose <= 140) {
        printf("Classifica��o: elevado");
    }
    else {
        printf("Classifica��o: diabetes");
    }

}
