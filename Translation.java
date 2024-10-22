import java.util.HashMap;
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        sc.nextLine();
        String[] input = sc.nextLine().split(" "); 
        int mapSize = sc.nextInt(); 
        sc.nextLine(); 
        HashMap<String, String> words = new HashMap<>(); 
        for (int i = 0; i < mapSize; i++) {
            String[] line = sc.nextLine().split(" ");
            words.put(line[0], line[1]); 
        }

        StringBuilder sb = new StringBuilder(n); 
        for (int i = 0; i < n; i++) {
            sb.append(words.get(input[i]) + " "); 
        }
        sc.close();
        String output = sb.toString().trim(); 
        System.out.println(output);
        
    }
}
