import java.math.BigInteger;
import java.util.Scanner;

public class Quickestimate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int lines = sc.nextInt(); 
        for (int i = 0; i < lines; i++) {
            BigInteger number = sc.nextBigInteger(); 
            String rep = ""+number; 
            int length = rep.length(); 
            System.out.println(length);
        }
        sc.close();
    }
}
