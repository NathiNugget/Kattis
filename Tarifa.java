import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int allowance = sc.nextInt(); 
        int months = sc.nextInt();
        int spare = 0; 
        for (int i = 0; i < months; i++) {
            spare += allowance - sc.nextInt(); 
        }
        sc.close();
        System.out.println(allowance + spare);
    }
        
        
}