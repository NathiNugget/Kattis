import java.util.Scanner;

public class Biladlyklabord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        char previous = '\\';  
        sc.close();
        StringBuilder sb = new StringBuilder(input.length()); 
        for (char c : input.toCharArray()) {
            if (c != previous){
                sb.append(c); 
                previous = c; 
            }
            else {
                previous = c; 
            }
        }
        System.out.println(sb.toString().trim());

    }
}
