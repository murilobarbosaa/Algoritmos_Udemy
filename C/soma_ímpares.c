#include <stdio.h>
#include <locale.h>

int x, y, troca, soma = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite dois n�meros: \n");
    scanf("%d %d", &x, &y);

    if (x > y) {
        troca = x;
        x = y;
        y = troca;
    }

    for (int i = x + 1; i < y; i++) {
        if (i % 2 != 0) {
            soma += i;
        }
    }

    printf("SOMA DOS �MPARES = %d", soma);

}
