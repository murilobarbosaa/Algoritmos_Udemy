#include <stdio.h>
#include <locale.h>

char nome1[100], nome2[100];
int idade1, idade2;
double media;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Dados da primeira pessoa: \n");
    printf("Nome: ");
    gets(nome1);
    printf("Idade: ");
    scanf("%d", &idade1);

    printf("Dados da segunda pessoa: \n");
    printf("Nome: ");
    fseek(stdin, 0, SEEK_END);
    gets(nome2);
    printf("Idade: ");
    scanf("%d", &idade2);

    media = (double)(idade1 + idade2) / 2;
    printf("A idade média de %s e %s é de %.1lf anos", nome1, nome2, media);
}
