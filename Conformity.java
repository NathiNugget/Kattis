import java.util.HashMap;
import java.util.Scanner;

public class Conformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int frosh = sc.nextInt(); 
        HashMap<Integer, Integer> courses = new HashMap<>(); 
        for (int i = 0; i < frosh; i++) {
            int newKey = 0; 
            for (int j = 0; j < 5; j++) {
                newKey = sc.nextInt(); 
                if (!courses.containsKey(newKey)){
                    courses.put(newKey, 1); 
                }
                else {
                    courses.put(newKey,  courses.get(newKey)+1);
                }
            }
            
        }

        int max = 0; 

        for (Integer i : courses.values()) {
            if (max < i){
                max = i; 
            }
        }
        System.out.println(max);
        
        sc.close();
    }
}
