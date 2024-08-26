import java.util.Scanner;

public class Dfyrirdreki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (int) Math.pow(b, 2) - 4 * (a * c);
        if (d < 0) {
            System.out.println(0);
        } else if (d == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        sc.close();
    }
}
