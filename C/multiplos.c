#include <stdio.h>
#include <locale.h>

int x, y;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite dois n�meros inteiros: \n");
    scanf("%d", &x);
    scanf("%d", &y);

    if (x % y == 0 || y % x == 0) {
        printf("S�o m�ltiplos");
    }
    else {
        printf("N�o s�o m�ltiplos");
    }

}
