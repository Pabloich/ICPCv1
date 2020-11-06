package competencia;

import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double[] values = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = Math.log(in.nextDouble());
        }

        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += values[i];
        }
        avg /= n;

        double desv = 0;
        for (int i = 0; i < n; i++) {
            desv += Math.pow(values[i] - avg, 2);
        }
        desv /= n - 1;
        desv = Math.sqrt(desv);

        System.out.printf("%.2f\n", Math.round(Math.exp(avg - 2 * desv) * 100) / 100.0);
        System.out.printf("%.2f\n", Math.round(Math.exp(avg - desv) * 100) / 100.0);
        System.out.printf("%.2f\n", Math.round(Math.exp(avg) * 100) / 100.0);
        System.out.printf("%.2f\n", Math.round(Math.exp(avg + desv) * 100) / 100.0);
        System.out.printf("%.2f\n", Math.round(Math.exp(avg + 2 * desv) * 100) / 100.0);
    }
}
