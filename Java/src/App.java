import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scann = new Scanner(System.in);
        int nums[] = { 2, 10, 5, 10, 20 };

        // Verifica se a condição foi satisfeita
        boolean isCondicion = false;

        // Criando um novo array e copiando os elementos do array original para ele  
        int newArray[] = new int[nums.length];
        System.arraycopy(nums, 0, newArray, 0, nums.length); // copiando o array
        System.out.println("Number : ");
        int target = scann.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Se a condição for satisfeita retorna esse if
                if (nums[i] + nums[j] == target) {
                    System.out.printf("%d + %d = %d ", nums[i], nums[j], target);
                    System.out.printf("\nIndices : %d | %d \nArray :\n", i, j);
                    // Marcando os numeros utilizados para formar um par cuja soma é igual ao "target"
                    nums[i] = Integer.MIN_VALUE;
                    nums[j] = Integer.MIN_VALUE;
                    /* 
                        Integer.MIN_VALUE = Marcando o primeiro numero do par como usado 
                        Caso não tenha o resultado será duplicado
                    */

                    isCondicion = true;
                }
            }
        }

        // Exibindo o array original
        for (int a = 0; a < newArray.length; a++) {
            System.out.println(newArray[a]);
        }
        // Caso o numero "target" for inexistente retorna o if
        if (!isCondicion) {
            System.out.println("Erro, número inexistente");
        }
    }
}
