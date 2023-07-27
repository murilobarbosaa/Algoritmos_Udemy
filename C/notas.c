#include <stdio.h>
#include <locale.h>

double nota1, nota2, notaFinal;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%lf", &nota2);

    notaFinal = nota1 + nota2;
    printf("NOTA FINAL = %.1lf\n", notaFinal);

    if (notaFinal < 60.0) {
        printf("REPROVADO \n");
    }
    else {
        printf("APROVADO \n");
    }

    return 0;
}
