#include <stdio.h>
#include <locale.h>

int casos;
double x, y, z, media;

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Quantos casos você vai digitar? ");
    scanf("%d", &casos);

    for (int i = 0; i < casos; i++) {
        printf("Digite %d números: \n", casos);
        scanf("%lf %lf %lf", &x, &y, &z);
        media = (x * 2 + y * 3 + z * 5) / 10;
        printf("MEDIA = %.1lf \n", media);
    }
}
