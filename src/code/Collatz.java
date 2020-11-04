package code;

import java.util.HashMap;
/**
 * Collatz
 */
public class Collatz {

    static HashMap<Integer, Integer> ciclos;

    public static void main(String[] args) {
        int min = 900, max = 1000;
        int res = collatz(min, max);
        System.out.println(min + " " + max + " " + res);
    }

    private static int collatz(int min, int max) {
        ciclos = new HashMap<Integer, Integer>();
        int maximo = 0;

        for (int i = min; i < max; i++) {
            int num = i;
            int iteraciones = 1;

            while (num != 1) {
                if (ciclos.containsKey(num)) iteraciones += ciclos.get(num);
                if (num % 2 == 0) num /= 2;
                else num = num * 3 + 1;

                iteraciones++;
            }
            ciclos.put(num, iteraciones);
            maximo = Math.max(maximo, iteraciones);
        }
        return maximo;
    }
}
