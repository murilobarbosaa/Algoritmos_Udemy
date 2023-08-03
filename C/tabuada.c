#include <stdio.h>
#include <locale.h>

int x;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Deseja saber a tabuada para qual valor? ");
    scanf("%d", &x);

    for (int i = 0; i < 11; i++) {
        int temp = i * x;
        printf("%d x %d = %d \n", x, i, temp);
    }

}
