import java.util.Scanner;

public class Skruop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int Vol = 7; 
        int N = sc.nextInt();
        sc.nextLine();  
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine(); 
            switch (input) {
                case "Skru op!":
                    if (Vol < 10) {Vol++;}
                    break;
                case "Skru ned!":
                    if (Vol > 0) {Vol--;} 
                    break; 
                default:
                    break;
            }
        
        }
        System.out.println(Vol);
        sc.close();
    }
}
