#include "stdio.h"

char romanValuesChar[] = {'I', 'v', 'X', 'L', 'C', 'D', 'M'};
char romanValuesNumbers[] = {1, 5, 10, 50, 100, 500, 1000};
int length = sizeof(romanValuesChar) / sizeof(romanValuesChar[0]);

// Buscando o valor associado a um caractere romano
int getRomanValues(char c){
    for (int i = 0; i < length; i++){
        if (romanValuesChar[i] == c){
            return romanValuesNumbers[i];
        }
    }
    return -1; // Caractere não encontrado
}

// Convertendo uma string numeral romano para inteiro
int romanToInt(const char *s){
    int resultado = 0;
    // Itera sobre a string do numeral romano
    for (int i = 0; s[i] != '\0'; i++){
        int currentValue = getRomanValues(s[i]);

        // Se o proximo numero existir e tiver um valor maior, substitui o valor atual
        if (s[i + 1] != '\0' && getRomanValues(s[i + 1]) > currentValue){
            resultado -= currentValue;
        } else {
            // caso contrario, adiciona o valor atual ao resultado
            resultado += currentValue;
        }
    }
    return resultado;
}

int main(){
    printf("%d\n", romanToInt("III"));
    printf("%d\n",romanToInt("ILV"));
    printf("%d\n",romanToInt("XXXMCXLV"));
}