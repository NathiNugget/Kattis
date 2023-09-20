import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Set<String> hashSet = new HashSet<>(); 
        int cases = sc.nextInt(); 
        
       
     for (int i = 0; i < cases; i++) {
            hashSet.clear();
            int trips = sc.nextInt(); 
            int uni = 0; 
            for (int j = 0; j < trips; j++) {
                String current = sc.next(); 
                if (!hashSet.contains(current)) {
                    uni++; 
                }
                hashSet.add(current); 
                
                
            }
            System.out.println(uni);
        }
        sc.close();
    }
}
 