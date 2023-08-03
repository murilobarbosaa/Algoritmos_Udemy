#include <stdio.h>
#include <locale.h>

int x;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite o valor de X: ");
    scanf("%d", &x);

    for (int i = 0; i <= x; i++) {
        if (i % 2 != 0) {
            printf("%d \n", i);
        }
    }

}
