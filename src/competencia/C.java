package competencia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * C
 */
public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<int[]> input = new ArrayList();
        while(in.hasNext())
            input.add(new int[] {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()});

        HashMap<Integer, Integer> visited = new HashMap();
        for (int[] is : input) {
            int a = is[0];
            int c = is[1];
            int m = is[2];
            int x = is[3];
            visited.clear();

            int i = 0;
            visited.put(x, i++);
            x = (a * x + c) % m;
            while (!visited.containsKey(x)) {
                visited.put(x, i++);
                x = (a * x + c) % m;
            }

            System.out.print((i == m) ? "YES " : "NO ");
            System.out.println(i + " " + visited.get(x) + " " + (i - visited.get(x)));
        }
    }
}
