import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Conformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int frosh = sc.nextInt(); 
        ArrayList<Integer>[] arrayLists = new ArrayList[frosh]; 
        for (int i = 0; i < frosh; i++) {
            for (int j = 0; j < 5; j++) {
                arrayLists[i].add(sc.nextInt()); 
            }
            arrayLists[i].sort((x, y) -> {
                if (x < y) return -1;
                if (x > y) return 1; 
                return 0; 
            });
        }

        int max = 0; 
        HashSet<Integer> set = new HashSet<>(); 
        
        

        
        

    }

}
