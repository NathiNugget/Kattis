import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] input = sc.nextLine().toCharArray(); 
        sc.close();
        String output = ""; 
        for (int i = 0; i < input.length; i++) {
            output += input[i]; 
            if ((input[i] + ("")).equals("e")) {
                output += "e";  
            }
        } 
    
        System.out.println(output); 

    }
}
