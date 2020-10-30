package Clase1;

/**
 * Acarreo
 */
public class Acarreo {

    public static void main(String[] args) {
        System.out.println(acarreo(99, 9991));
    }

    private static int acarreo(int n1, int n2) {
        int cuenta = 0;
        int acarrea = 0;

        while (n1 != 0 && n2 != 0) {
            acarrea = ((acarrea + n1 % 10 + n2 % 10) >= 10) ? 1: 0;
            cuenta += acarrea;

            n1 /= 10;
            n2 /= 10;
        }

        while (acarrea != 0) {
            if (n1 % 10 == 9 || n2 % 10 == 9)
                cuenta++;
            else acarrea = 0;

            n1 /= 10;
            n2 /= 10;
        }


        return cuenta;
    }
}
