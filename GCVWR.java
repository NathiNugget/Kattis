import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int G = sc.nextInt(); 
        int T = sc.nextInt(); 
        int N = sc.nextInt(); 
        int sum = 0; 
        for (int i = 0; i < N; i++) {
            sum += sc.nextInt(); 
        }
        System.out.println((int) ((G-T)*.9-sum));
        sc.close();
    }
}
