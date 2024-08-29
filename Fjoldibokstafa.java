import java.util.Scanner;

public class Fjoldibokstafa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char lowerSmall = 'a'; 
        char upperSmall = 'z'; 
        char lowerCapital = 'A'; 
        char upperCapital = 'Z'; 

        int num = 0; 

        String input = sc.nextLine(); 
        sc.close(); 
        for (char c : input.toCharArray()) {
            if ((c >= lowerSmall && c <= upperSmall) || (c >= lowerCapital && c <= upperCapital)){
                num++; 
            }
        }
        System.out.println(num);
    }
}
