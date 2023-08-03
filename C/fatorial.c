#include <stdio.h>
#include <locale.h>

int n, fatorial = 1;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite o valor de N: ");
    scanf("%d", &n);

    for (int i = n; i > 0; i--) {
        fatorial = fatorial * i;
    }
    printf("FATORIAL = %d", fatorial);
}
