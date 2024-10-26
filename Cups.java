import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cups {
    public static void main(String[] args) {
        // LEFT = DIAMATER -> RIGHT = RADIUS
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt();
        sc.nextLine();   
        String[][] rings = new String[cases][2]; 
        HashMap<Integer, String> outputs = new HashMap<>(); 
        for (int i = 0; i < cases; i++) {
            rings[i] = sc.nextLine().split(" "); 
            int keyVal; 
            try {
                keyVal = Integer.parseInt(rings[i][0]); 
                outputs.put(keyVal, (rings[i][1]));
            } catch (Exception e){
                keyVal = Integer.parseInt(rings[i][1]); 
                outputs.put(keyVal*2, rings[i][0]);
            }
            
        }



        ArrayList<Integer> keysList = new ArrayList<>(outputs.keySet()); 
        keysList.sort((x, y) -> {
            if (x > y) return 1; 
            if (x < y) return -1; 
            return 0; 
        });

        for (Integer integer : keysList) {
            System.out.println(outputs.get(integer));
        }

        sc.close();
    }
}
