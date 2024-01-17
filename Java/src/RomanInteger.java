import java.util.HashMap;

public class RomanInteger {
    public static int romanToInt(String s){

        // Map para associar os valores ao simbolo 
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 60);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int resultado = 0;
        // Itera sobre a string do numeral romano
        for (int i = 0; i < s.length(); i++) {
            // Obtem o valor do simbolo atual 
            int currentValue = romanMap.get(s.charAt(i));

            // Se o proximo simbolo sxistir e tiver um valor maior, substitui o valor atual
            if (i < s.length() -1 && romanMap.get(s.charAt(i + 1)) > currentValue){
                resultado -= currentValue;
            } else {
                // Caso contrario, adiciona o valor atual ao resultado
                resultado += currentValue;
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("ILV"));
        System.out.println(romanToInt("XXXMCXLV"));
    }
}
