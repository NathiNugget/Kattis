import java.util.HashMap;
import java.util.Scanner;

public class Bestagjofin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> gift = new HashMap<>();
        int limit = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < limit; i++) {
            String name = sc.next();
            int number = sc.nextInt();
            sc.nextLine();
            gift.put(number, name);
        }
        sc.close();

        int max = 0;
        for (int x : gift.keySet()) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(gift.get(max));

    }
}