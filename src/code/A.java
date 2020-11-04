package code;

import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        A(5, 13);
    }

    private static void A(int n, int q) {
        Scanner in = new Scanner(System.in);
        int[][] preference = new int[n + 1][n + 1];
        int maxi = 0, maxj = 0;
        String respuesta = "";

        for (int r = 0; r < q; r++) {
            String operation = in.next();
            if (operation.equals("R")) {
                int i = in.nextInt();
                int j = in.nextInt();

                ++preference[i][j];
                if (preference[i][j] > preference[maxi][maxj]) {
                    maxi = i;
                    maxj = j;
                }
            } else if (operation.equals("Q")) {
                int i = in.nextInt();
                int max = max(preference[i]);

                if (max == 0) respuesta += "No info\n";
                else if (count(preference[i][max], preference[i]) > 1) respuesta += "Multiple\n";
                else respuesta += max + "\n";
            } else respuesta += maxi + " " + maxj + "\n";
        }
        System.out.println(respuesta);
    }

    private static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int count(int num, int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (num == i) ++count;
        }
        return count;
    }
}
