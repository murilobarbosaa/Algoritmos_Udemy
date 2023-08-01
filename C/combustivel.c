#include <stdio.h>
#include <locale.h>

int alcool = 0; gasolina = 0; diesel = 0, codigo;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Informe um código (1, 2, 3) ou 4 para parar: ");
    scanf("%d", &codigo);

    while (codigo != 4) {
        if (codigo == 1) {
            alcool ++;
        }
        else if (codigo == 2) {
            gasolina ++;
        }
        else if (codigo == 3) {
            diesel ++;
        }
        printf("Informe um código (1, 2, 3) ou 4 para parar: ");
        scanf("%d", &codigo);
    }

    printf("MUITO OBRIGADO\n");

    printf("Álcool: %d \n", alcool);
    printf("Gasolina: %d \n", gasolina);
    printf("Diesel: %d \n", diesel);

}
