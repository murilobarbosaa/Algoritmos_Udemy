#include <stdio.h>
#include <locale.h>

int x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite dois n�meros: \n");
    scanf("%d", &x);
    scanf("%d", &y);

    while (x != y) {
        if (x > y) {
            printf("DECRESCENTE! \n");
        }
        else {
            printf("CRESCENTE! \n");
        }
    printf("Digite outros 2 n�meros: \n");
    scanf("%d", &x);
    scanf("%d", &y);
    }

}
