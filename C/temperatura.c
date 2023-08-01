#include <stdio.h>
#include <locale.h>

char temperatura;
double c, f;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Você vai digitar a temperatura em qual escala (C/F)? ");
    scanf("%c", &temperatura);

    if ( temperatura == 'F') {
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &f);
        c = (f - 32) / 1.8;
        printf("Temperatura equivalente em Celsius: %.2lf ", c);
    }
    else {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &c);
        f = (c * 1.8) + 32;
        printf("Temperatura equivalente em Fahrenheit: %.2lf ", f);
    }

}
