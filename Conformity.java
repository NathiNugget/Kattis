import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Conformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int frosh = sc.nextInt(); 
        ArrayList<Integer>[] intListArr = new ArrayList[frosh]; 
        for (int i = 0; i < frosh; i++) {
            intListArr[i] = new ArrayList<>(); 
            for (int j = 0; j < 5; j++) {
                intListArr[i].add(sc.nextInt()); 
            }
            intListArr[i].sort((x, y) -> {
                if (x > y) return 1; 
                if (x < y) return -1; 
                return 0; 
            });
        }

        int max = 0; 
        ArrayList<Integer> combinations = new ArrayList<>(); 
        ArrayList<Integer> localList = new ArrayList<>();
        int localmax = 0;  


        for (int i = 0; i < intListArr.length; i++) {
            if (i != 0){
                if (Equals(intListArr[i], intListArr[i-1])){
                    if (combinations.size() == 0){
                        for (Integer integer : intListArr[i]) {
                            combinations.add(integer); 
                        }
                    } else if (max > 2){
                        if (localList.size() == 0){
                            for (Integer integer : intListArr[i]) {
                                localList.add(integer); 
                                localmax++; 
                            }
                        }
                        else localmax++;    
                            

                    } 

                } 
            }
        }

        sc.close();
    }

    public static boolean Equals(ArrayList<Integer> first, ArrayList<Integer> second){
        if (first.size() != second.size()) return false;
            
            
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) != second.get(i)) return false; 
        }
        return true; 
    }
}
