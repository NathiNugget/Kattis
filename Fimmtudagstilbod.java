import java.util.Scanner;

public class Fimmtudagstilbod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 2020) {
            System.out.println((input - 2020) * 100 + 1000);
        } else {
            System.out.println(1000);
        }
        sc.close();

    }

}