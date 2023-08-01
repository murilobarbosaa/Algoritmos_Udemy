#include <stdio.h>
#include <locale.h>

int codigo, quantidade;
double preco;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Código do produto comprado: ");
    scanf("%d", &codigo);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);

    switch (codigo) {
    case 1:
        preco = quantidade * 5.0;
        break;
    case 2:
        preco = quantidade * 3.5;
        break;
    case 3:
        preco = quantidade * 4.8;
        break;
    case 4:
        preco = quantidade * 8.9;
        break;
    case 5:
        preco = quantidade * 7.32;
        break;
    }

    printf("Valor a pagar: R$ %.2lf ", preco);

}
