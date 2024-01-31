import java.util.Scanner;

public class Sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        int C = 0;
        int G = 0;
        char[] input = sc.nextLine().toCharArray();
        for (char c : input) {
            if (c == 'T') {
                T++;
            }
            if (c == 'C') {
                C++;
            }
            if (c == 'G') {
                G++;
            }
        }
        int total = 0;
        total += 7 * findSmallest(G, findSmallest(T, C));
        total += Math.pow(T, 2) + Math.pow(C, 2) + Math.pow(G, 2);
        System.out.println(total);
        sc.close();
    }

    private static int findSmallest(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
