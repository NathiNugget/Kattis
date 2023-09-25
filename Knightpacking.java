import java.util.Scanner;

public class Knightpacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        if (n % 2 == 0) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }
        sc.close();
    }
}
