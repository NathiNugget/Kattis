import java.util.Scanner;

public class Addingtrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); 
        sc.close();
        if (a + b == c) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
