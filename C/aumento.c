#include <stdio.h>
#include <locale.h>

double salario, aumento, novoSalario;
int porcentagem;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Digite o salário da pessoa: ");
    scanf("%lf", &salario);

    if (salario <= 1000) {
        aumento = salario * 0.2;
        novoSalario = salario + aumento;
        porcentagem = 20;
    }
    else if (salario <= 3000) {
        aumento = salario * 0.15;
        novoSalario = salario + aumento;
        porcentagem = 15;
    }
    else if (salario <= 8000) {
        aumento = salario * 0.1;
        novoSalario = salario + aumento;
        porcentagem = 10;
    }
    else {
        aumento = salario * 0.05;
        novoSalario = salario + aumento;
        porcentagem = 5;
    }

    printf("Novo salário = R$ %.2lf \n", novoSalario);
    printf("Aumento = R$ %.2lf \n", aumento);
    printf("Porcentagem = %d %% \n", porcentagem);

}
