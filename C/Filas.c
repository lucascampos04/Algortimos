#include <stdio.h>
#include <stdlib.h>

int main() {
    int linhas = 5;

    for (int i = 1; i <= linhas; i++){
        for (int j = 1; j <= linhas - i; ++j) {
            printf(" ");
        }

        for (int k = 1; k <= 2 * i - 1; k++){
            printf("%d", k);
        }

        printf("\n");
    }
    return 0;
}
