import java.util.Scanner;

public class Jumbojavelin {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            int N = sc.nextInt(); 
            int res = 0;
            for (int i = 0; i < N; i++) {
                res += sc.nextInt()-1; 
            }
            System.out.println(res+1); 
            sc.close();
    }
}