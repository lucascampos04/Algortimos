#include <stdio.h>

void trocar(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int *array, int tamanho) {
    for (int i = 0; i < tamanho - 1; i++) {
        for (int j = 0; j < tamanho - i - 1; j++) {
            if (*(array + j) > *(array + j + 1)) {
                trocar(array + j, array + j + 1);
            }
        }
    }
}

void imprimirArray(int *array, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", *(array + i));
    }
    printf("\n");
}


int main() {
    int numeros[] = {64, 34, 25, 12, 22, 11, 90};
    int tamanho = sizeof(numeros) / sizeof(numeros[0]);

    printf("Array antes da ordenação: ");
    imprimirArray(numeros, tamanho);

    bubbleSort(numeros, tamanho);

    printf("Array depois da ordenação: ");
    imprimirArray(numeros, tamanho);

    return 0;
}
