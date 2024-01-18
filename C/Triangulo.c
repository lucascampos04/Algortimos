#include "stdio.h"

int main(){
    int altura;
    printf("Altura do triangulo: ");
    scanf("%d", &altura);
    
    for (int linha = 1; linha <= altura; linha++){
        for (int coluna = 1; coluna <= linha; coluna++){
            printf("* ");
        }
        printf("\n");
    }

    for (int linha = 1; linha <= altura; linha++){
        for ( int space = altura - linha; space > 0; space--){
            printf("* ");
        }
        printf("\n");
    }
}