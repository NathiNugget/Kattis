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
                intArr[j] = sc.nextInt(); 
                if (!hMap.containsKey(j)) {
                    hMap.put(intArr[j], false); 
                } else {
                    hMap.put(intArr[j], !hMap.get(intArr[j])); 
                }
            }
            int val = i+1; 
            for (int j = 0; j < intArr.length; j++) {
                if (hMap.get(intArr[j]) == false){
                    System.out.println("Case #" + val +": " + intArr[j]);
                }
            }
        }
        sc.close();
    }
}
