#include <stdio.h>
#include <locale.h>

double largura, comprimento, valor;
double area = 0;
double preco = 0;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite a largura do terreno: ");
    scanf("%lf", &largura);
    printf("Digite o comprimento do terrero: ");
    scanf("%lf", &comprimento);
    printf("Digite o valor do metro quadrado: ");
    scanf("%lf", &valor);

    area = largura * comprimento;
    preco = area * valor;

    printf("\n");
    printf("Área do terreno = %.2lf \n", area);
    printf("Preço do terreno = %.2lf \n", preco);
}
