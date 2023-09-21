import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "" + sc.nextInt(); 
        sc.close();
        if (input.substring(0, 3).equals("555")) {
            System.out.println(1); 
        } else {
            System.out.println(0); 
        }

    }
}
