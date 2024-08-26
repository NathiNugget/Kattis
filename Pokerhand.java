import java.util.HashMap;
import java.util.Scanner;

public class Pokerhand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            char c = sc.next().toCharArray()[0];
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else
                map.put(c, map.get(c) + 1);
        }
        String currentMax = null;

        for (Character c : map.keySet()) {
            if (currentMax == null) {
                currentMax = "" + c;
            } else {
                if (map.get(c) > map.get(currentMax.toCharArray()[0])) {
                    currentMax = "" + c;
                }
            }

        }
        System.out.println(map.get(currentMax.toCharArray()[0]));
        sc.close();
    }
}
