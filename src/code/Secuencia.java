package code;

import java.util.BitSet;
/**
 * Secuencia
 */
public class Secuencia {

    public static void main(String[] args) {
        short n = 5;

        if (n == 1) {
            System.out.println("Saltarina");
            return;
        }
        System.out.println(saltarina(n, new short[] {1, 4, 5, 7, 3}));
    }

    private static String saltarina(short n, short[] data) {
        BitSet steps = new BitSet(n - 1);


        for(short i = 0; i < data.length - 1; ++i) {
            short step = (short) Math.abs(data[i] - data[i + 1]);

            if (step > n || steps.get(step)) return "No es saltarina";
            else steps.set(step);
        }

        return (steps.cardinality() == n - 1) ? "Saltarina" : "No es saltarina";
    }
}
