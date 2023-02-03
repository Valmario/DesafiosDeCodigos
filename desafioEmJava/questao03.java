package Desafio;

/* Autor Valmário Lopes

** programa para encontrar o número de pares de substrings que são anagramas*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class questao03 {

    public static void main(String[] args) {
        // entrada da da string
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite uma palavra: ");
			subString(input.nextLine());
		}
    }

    // manipulação das partes da string
    static void subString(String palavra) {
        HashMap<String, Integer> map = new HashMap<>();
        // laço de repetição
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                char[] valC = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val) + 1);
                else
                    map.put(val, 1);
            }
        }
        // variável para informar a quantidade de anagramas
        int anagramPairCount = 0;
        // mapeia em busca de anagramas e guarda nas variáveis
        for (String key : map.keySet()) {
            int n = map.get(key);
            anagramPairCount += (n * (n - 1)) / 2;
        }
        // saída da quantidade de anagramas
        System.out.println(anagramPairCount);
    }
}