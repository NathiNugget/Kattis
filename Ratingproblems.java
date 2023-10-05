import java.util.Scanner;

public class Ratingproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double n = sc.nextDouble(); 
        double k_voted = sc.nextDouble(); 
        double total = 0.0; 
        for (int i = 0; i < k_voted; i++) {
            total += sc.nextDouble(); 
        }
        sc.close();
        System.out.println((total - (n-k_voted)*3)/n + " " + (total + (n-k_voted)*3)/n );
    }
}
