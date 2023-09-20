import java.util.Scanner;

public class Apaaaxians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] input = sc.next().toCharArray(); 
        sc.close();
        StringBuilder sb = new StringBuilder(); 
        char current = '#'; 
        for (char c : input) {
            if (current != c) {
                current = c; 
                sb.append(c); 
            }
        }
        System.out.println(sb.toString());
    }
}
