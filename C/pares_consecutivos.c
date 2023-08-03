#include <stdio.h>
#include <locale.h>

int x, soma;

int main(){
    setlocale(LC_ALL, "Portuguese");

    printf("Digite um numero inteiro: ");
    scanf("%d", &x);

    while (x != 0) {
        if (x % 2 != 0) {
            x++;
        }

        soma = 5 * x + 20;
        printf("SOMA = %d\n", soma);

        printf("Digite um numero inteiro: ");
		scanf("%d", &x);
    }

}
