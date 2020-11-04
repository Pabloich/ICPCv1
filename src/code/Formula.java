package code;

import java.util.Scanner;

/**
 * Formula
 */
public class Formula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dame el valor de (a): ");
        byte a = in.nextByte();
        if (a == 0) {
            System.out.println("El valor de la variable (a) no es"
                + "valido. Fin del programa");
            in.close();
            return;
        }
        System.out.print("Dame el valor de (b): ");
        byte b = in.nextByte();
        System.out.print("Dame el valor de (c): ");
        byte c = in.nextByte();
        System.out.print("Dame el valor de (d): ");
        byte d = in.nextByte();
        in.close();

        System.out.println("El resultado de la formula es: "
            + (((a + b) / 2) * (c * d / a) + 1));
    }
}
