import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Helen", "Martha"};

        // Preencher o array 'a' com números de 1 a 10
        IntStream.range(0, a.length)
                .forEach(i -> a[i] = i + 1);

        // Imprimir números pares do array 'a'
        System.out.println("Números pares:");
        Arrays.stream(a)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // Imprimir nomes que contêm letras diferentes
        System.out.println("\nNomes com letras diferentes:");
        Arrays.stream(names)
                .filter(name -> name.chars().distinct().count() > 1)
                .forEach(System.out::println);

        // Solicitar uma letra e imprimir nomes que a contêm
        System.out.println("\nNomes que contêm a letra:");
        String letters = sc.nextLine();
        Arrays.stream(names)
                .filter(name -> name.contains(letters))
                .forEach(System.out::println);

        // Solicitar uma letra e imprimir nomes que começam com ela
        System.out.println("\nNomes que começam com a letra:");
        String lettersInit = sc.nextLine();
        Arrays.stream(names)
                .filter(name -> name.toLowerCase().startsWith(lettersInit.toLowerCase()))
                .forEach(System.out::println);

        // Solicitar uma letra e imprimir nomes que terminam com ela
        System.out.println("\nNomes que terminam com a letra:");
        String lettersEnd = sc.nextLine();
        Arrays.stream(names)
                .filter(name -> name.toLowerCase().endsWith(lettersEnd.toLowerCase()))
                .forEach(System.out::println);
    }
}
