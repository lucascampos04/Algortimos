public class ArrayDate {
    public static void main(String[] args) {
        int[] nums = { 2, 10, 5, 10, 20 };

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    // Trocando elementos se estiverem fora de ordem
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Imprimindo o array ordenado
        System.out.println("Array ordenado:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
