import java.util.Scanner;

public class Hissingmicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] charArr = sc.nextLine().toCharArray(); 
        sc.close();
        char previous = ' '; 
        boolean hissFound = false; 
        for (char c : charArr) {
            if (c == 's' && previous == 's') {
                System.out.println("hiss");
                hissFound = true; 
                break; 
            }
            previous = c; 
        }
        if (!hissFound) {
            System.out.println("no hiss");
        }
    }
}
