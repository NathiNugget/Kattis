import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alphabetspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] charArr = sc.nextLine().toCharArray(); 
        Map<String, Integer> lowercase = new HashMap<>();
        Map<String, Integer> UPPERCASE = new HashMap<>();  
        double whiteSPC = 0.0; 
        double low = 0.0; 
        double up = 0.0;
        double sym = 0.0; 
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            lowercase.put(String.valueOf(ch), 0);
        }
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            UPPERCASE.put(String.valueOf(ch), 0);
        }

        for (char c : charArr) {
            if (c == '_'){
                whiteSPC++; 
            }
            else if (lowercase.containsKey(String.valueOf(c))){
                low++; 
            }
            else if (UPPERCASE.containsKey(String.valueOf(c))){
                up++; 
            }
            else sym++; 

        }
        sc.close();

        System.out.println(whiteSPC/charArr.length);
        System.out.println(low/charArr.length);
        System.out.println(up/charArr.length);
        System.out.println(sym/charArr.length);
    }
}
