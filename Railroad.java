import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numOfPaths = 0; 
        numOfPaths += sc.nextInt() * 4; 
        numOfPaths += sc.nextInt() * 3; 
        System.out.println(numOfPaths % 2 == 0 ? "possible" : "impossible");
        sc.close();
    }
}
