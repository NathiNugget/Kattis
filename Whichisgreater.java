import java.util.Scanner;

public class Whichisgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt(); int y = sc.nextInt(); 
        sc.close();
        if (x > y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
