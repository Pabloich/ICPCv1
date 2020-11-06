package competencia;

import java.util.Scanner;

/**
 * B
 */
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] cal = new int[n];
        int[] pro = new int[n];
        for (int i = 0; i < n; i++) {
            cal[i] = in.nextInt();
            pro[i] = in.nextInt();
        }

        double calificacion = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cal[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
            calificacion += cal[i] * pro[i] / 100.0;
        }

        if (calificacion < 6)
            System.out.println(0 + "\n:(");
        else System.out.println(Math.round(calificacion) + "\n:)");
    }
}
