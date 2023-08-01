#include <stdio.h>
#include <locale.h>

double nota1, nota2, media = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);

    while (nota1 < 0 || nota1 > 10) {
        printf("Valor inválido! Tente novamente: ");
        scanf("%lf", &nota1);
    }

    printf("Digite a segunda nota: ");
    scanf("%lf", &nota2);

    while (nota2 < 0 || nota2 > 10) {
        printf("Valor inválido! Tente novamente : ");
        scanf("%lf", &nota2);
    }

    media = (nota1 + nota2) / 2;

    printf("MÉDIA = %.2lf", media);
}
