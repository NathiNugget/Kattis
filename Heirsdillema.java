import java.util.Scanner;

public class Heirsdillema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;
        for (int i = L; i <= H; i++) {
            if (possible(i))
                count++;
        }
        System.out.println(count);
        sc.close();
    }

    public static boolean possible(int combo) {
        return diff(combo) && divs(combo);
    }

    public static boolean diff(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.substring(i, i + 1)) != s.lastIndexOf(s.substring(i, i + 1)))
                return false;
        return true;
    }

    public static boolean divs(int combo) {
        String s = Integer.toString(combo);
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(s.substring(i, i + 1));
            if (digit == 0)
                return false;
            else if (digit != 0 && combo % digit != 0)
                return false;
        }
        return true;
    }
}
