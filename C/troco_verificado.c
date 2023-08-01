#include <stdio.h>
#include <locale.h>

int quantidade;
double preco, dinheiro, troco;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Preço unitário do produto: ");
    scanf("%lf", &preco);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);
    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro);

    troco = preco * quantidade - dinheiro;

    if (troco > 0) {
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS", troco);
    }
    else {
        troco = dinheiro - preco * quantidade;
        printf("TROCO = %.2lf", troco);
    }

}
