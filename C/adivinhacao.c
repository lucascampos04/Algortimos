#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    char ops;
    do {
        srand(time(NULL));
        int numberRandom = rand() % 11;

        printf("Digite um número aleatório de 0 a 10: ");
        
        int numberUser;
        scanf("%d", &numberUser);
        
        if (numberRandom == numberUser) {
            printf("Parabéns, você acertou!\n");
        } else {
            printf("Que pena, você errou! O número aleatório era: %d\n", numberRandom);
        }
        printf("Deseja tentar novamente? (s/n): ");
        scanf(" %c", &ops);
    } while (ops != 'n' && ops != 'N');
    return 0;
}
