import java.util.HashMap;
import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        HashMap<Character, Integer> dom = new HashMap<>(){};
        dom.put('A', 11); 
        dom.put('K', 4); 
        dom.put('Q', 3); 
        dom.put('J', 20); 
        dom.put('T', 10); 
        dom.put('9', 14); 
        dom.put('8', 0); 
        dom.put('7', 0); 

        HashMap<Character, Integer> non = new HashMap<>(){};
        non.put('A', 11); 
        non.put('K', 4); 
        non.put('Q', 3); 
        non.put('J', 2); 
        non.put('T', 10); 
        non.put('9', 0); 
        non.put('8', 0); 
        non.put('7', 0); 

        int num = sc.nextInt();
        char suit = sc.next().toCharArray()[0]; 
        
        char[] charArr = new char[2]; 
        int sum = 0; 
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                charArr = sc.next().toCharArray(); 
                if (charArr[1] == suit) {
                    sum += dom.get(charArr[0]); 
                } else {
                    sum += non.get(charArr[0]); 
                }
            }
        } 
         
        System.out.println(sum);
        sc.close();
    }
}
