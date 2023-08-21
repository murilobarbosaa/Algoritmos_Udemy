#include <stdio.h>

double preco, quantidade, dinheiro, troco;

int main() {
    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);
    printf("Quantidade comprada: ");
    scanf("%lf", &quantidade);
    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro);

    troco = dinheiro - preco * quantidade;
    printf("TROCO = %.2lf", troco);
}
