import java.util.Scanner;

public class Reduplikation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        int lim = sc.nextInt();
        for (int i = 0; i < lim; i++) {
            output += input;
        }
        System.out.println(output);
        sc.close();
    }
}