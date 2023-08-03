#include <stdio.h>
#include <locale.h>

int n, x, dentro = 0, fora = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos números você vai digitar? ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Digite um número: ");
        scanf("%d", &x);
        if (x >= 10 && x <= 20) {
            dentro += 1;
        }
        else {
            fora += 1;
        }
    }

    printf("%d DENTRO \n", dentro);
    printf("%d FORA", fora);
}
