#include "stdio.h"
int main(){
    int nums[] = {1, 10, 25, 30};
    int target = 35;

    // Tamanho do array nums[]
    size_t size_elements = sizeof(nums) / sizeof(nums[0]);

    // Loop para comparar os elementos do array
    for (int i = 0; i < size_elements; i++) {
        for (int j = i + 1; j < size_elements; j++) {

            // Verifica se a soma dos elementos é igual ao valor "target", sem somar o mesmo elemento mais de uma vez
            if (nums[i] + nums[j] == target) {
                printf("Indices %d e %d - Valores: %d e %d - Soma: %d\n", i, j,
                       nums[i], nums[j], target);
                return 0;
            }
        }
    }

    printf("Resultado não encontrado");
}