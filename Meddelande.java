import java.util.Scanner;

public class Meddelande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = sc.nextInt();
        int rows = sc.nextInt();
        sc.nextLine();
        String input = "";
        String output = "";
        for (int i = 0; i < columns; i++) {
            input = sc.nextLine();
            for (int j = 0; j < rows; j++) {
                char c = input.toCharArray()[j];
                if (c != '.') {
                    output += c;
                }
            }
        }
        System.out.println(output);
        sc.close();
    }
}
