#include <stdio.h>
#include <locale.h>

int senha, tentativa;

int main() {
    setlocale(LC_ALL, "Portuguese");

    senha = 2002;

    printf("Digite a senha: ");
    scanf("%d", &tentativa);

    while (tentativa != senha) {
        printf("Senha inválida! Tente novamente: ");
        scanf("%d", &tentativa);
    }

    printf("Acesso permitido!");

}
