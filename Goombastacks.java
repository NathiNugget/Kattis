import java.util.Scanner;

public class Goombastacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        boolean canExit = true;
        int goombas = 0;  
        int needed = 0; 
        for (int i = 0; i < n; i++) {
            goombas += sc.nextInt(); 
            needed = sc.nextInt();  
            if (goombas < needed){
                canExit = false; 
                break; 
            }
        }
        System.out.println(canExit ? "possible" : "impossible");
        sc.close();
    }
}
