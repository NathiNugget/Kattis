import java.util.HashMap;
import java.util.Scanner;

public class Oddmanout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        for (int i = 0; i < N; i++) {
            int numOfGuests = sc.nextInt(); 
            HashMap<Integer, Boolean> hMap = new HashMap<>(); 
            int[] intArr = new int[numOfGuests]; 
            for (int j = 0; j < intArr.length; j++) {
                if (!hMap.containsKey(j)) {
                    hMap.put(j, false); 
                } else {
                    hMap.put(j, !hMap.get(j)); 
                }
            }
            hMap.forEach((key, value) -> {
                if (hMap.get(key) == true){
                    System.out.println("Case #" + (i+1) + " " + key);
                }
            });
        }
        sc.close();
    }
}
