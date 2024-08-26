import java.util.HashMap;
import java.util.Scanner;

public class Dagatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> days = new HashMap<>() {
        };
        days.put(1, 31);
        days.put(2, 28);
        days.put(3, 31);
        days.put(4, 30);
        days.put(5, 31);
        days.put(6, 30);
        days.put(7, 31);
        days.put(8, 31);
        days.put(9, 30);
        days.put(10, 31);
        days.put(11, 30);
        days.put(12, 31);
        System.out.println(days.get(sc.nextInt()));
        sc.close();
    }
}
