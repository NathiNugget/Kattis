import java.util.Scanner;

public class Judgingmoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        if (left == 0 && right == 0) {
            System.out.println("Not a moose");
        } else {
            if (left == right) {
                System.out.println("Even " + (left * 2));
            } else {
                if (left < right) {
                    System.out.println("Odd " + (2 * right));
                } else
                    System.out.println("Odd " + (2 * left));
            }
        }
        sc.close();
    }
}
