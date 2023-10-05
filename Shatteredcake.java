import java.util.Scanner;

public class Shatteredcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(); 
        int N = sc.nextInt(); 
        int W_i = 0;
        int L_i = 0; 
        int sum = 0; 
        for (int i = 0; i < N; i++) {
            W_i = sc.nextInt(); 
            L_i = sc.nextInt(); 
            sum += W_i*L_i; 
        }
        int L = sum/W;
        System.out.println(L); 

        sc.close();

    }
}
