import java.util.Scanner;

public class Spritt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); int x = sc.nextInt(); 
        int sum = 0; 
    for (int i = 0; i < n; i++) {
        sum += sc.nextInt(); 
    }   
        sc.close();
        if (sum <= x) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
    }
}
