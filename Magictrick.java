
import java.util.HashSet;
import java.util.Scanner;

public class Magictrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hSet = new HashSet<>();
        String input = sc.nextLine();
        boolean canDistinguish = true;
        for (char c : input.toCharArray()) {
            if (!hSet.contains(c)) {
                hSet.add(c);
            } else {
                canDistinguish = false;
                break;
            }
        }
        int res = canDistinguish ? 1 : 0;
        System.out.println(res);
        sc.close();
    }
}
