#include <stdio.h>
#include <locale.h>

double media;
int idade, soma = 0, cont = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite as idades: \n");
    scanf("%d", &idade);

    if (idade < 0) {
        printf("IMPOSSÍVEL CALCULAR");
    }
    else {
        while (idade > 0) {
            soma += idade;
            scanf("%d", &idade);
            cont ++;
        }

        media = (double)soma / cont;

        printf("MEDIA = %.2lf", media);
    }

}
