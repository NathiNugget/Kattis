import java.util.Scanner;

public class Heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt();
        double b; 
        double p; 
        for (int i = 0; i < cases; i++) {
            b = sc.nextDouble(); 
            p = sc.nextDouble(); 
            double ans = 60.0*(b/p); 
            double diff = 60.0/p; 
            System.out.println((ans-diff) + " " + (ans) + " " + (ans+diff));
        }
        sc.close();
    }
}
