package Clase1;

import java.util.Scanner;

/**
 * Gasolina
 */
public class Gasolina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce los kilometros recorridos con"
            + " el primer tanque: ");
        int k1 = in.nextByte();
        System.out.print("Introduce los litros consumidos en el"
            + " primer tanque: ");
        int l1 = in.nextByte();
        System.out.print("Introduce los kilometros recorridos con"
            + " el segundo tanque: ");
        int k2 = in.nextByte();
        System.out.print("Introduce los litros consumidos en el"
            + " segundo tanque: ");
        int l2 = in.nextByte();
        System.out.print("Introduce los kilometros recorridos con"
            + " el tercer tanque: ");
        int k3 = in.nextByte();
        System.out.print("Introduce los litros consumidos en el"
            + " tercer tanque: ");
        int l3 = in.nextByte();
        in.close();

        System.out.println("Rendimiento del primer tanque: .... "
            + ((float) k1 / l1) + " kilometros por litro");
        System.out.println("Rendimiento del segundo tanque: ... "
            + ((float) k2 / l2) + " kilometros por litro");
        System.out.println("Rendimiento del tercer tanque: .... "
            + ((float) k3 / l3) + " kilometros por litro");
    }
}
