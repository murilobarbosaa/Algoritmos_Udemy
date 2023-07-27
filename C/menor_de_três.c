#include <stdio.h>
#include <locale.h>

int x, y, z, menor;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite o primeiro valor: ");
    scanf("%d", &x);
    printf("Digite o segundo valor: ");
    scanf("%d", &y);
    printf("Digite o terceiro valor: ");
    scanf("%d", &z);

    if (x < y & x < z) {
        menor = x;
    }
    else if (y < x & y < z) {
        menor = y;
    }
    else {
        menor = z;
    }

    printf("MENOR = %d", menor);
}
