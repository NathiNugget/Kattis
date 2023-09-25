import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int lim = sc.nextInt(); 
        int num; 
        for (int i = 0; i < lim; i++) {
            num = sc.nextInt(); 
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
        sc.close();

    }
}
