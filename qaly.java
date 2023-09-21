import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        double q; 
        double y; 
        double qual = 0.0; 
        for (int i = 0; i < N; i++) {
            q = Double.parseDouble(sc.next());
            y = Double.parseDouble(sc.next());
            qual += q*y; 
             
        }
        System.out.println(qual);
    
        sc.close();
    }
}
