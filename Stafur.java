import java.util.Scanner;

public class Stafur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U")
                || input.equals("Y")) {
            if (input.equals("Y")) {
                System.out.println("Kannski");
            } else
                System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
        sc.close();
    }
}
