import java.util.HashMap;
import java.util.Scanner;

public class Knotknowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        HashMap<Integer, Boolean> hMap = new HashMap<>(); 
        for (int i = 0; i < N; i++) {
            hMap.put(sc.nextInt(), true); 
        }
        for (int i = 0; i < N-1; i++) {
            hMap.put(sc.nextInt(), false); 
        }
        hMap.forEach((key, _) -> {
            if (hMap.get(key) == true) System.out.println(key); 
        });
        sc.close();
    }
}
