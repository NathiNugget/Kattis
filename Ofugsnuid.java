import java.util.Scanner;

public class Ofugsnuid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        Long[] intArr = new Long[N]; 
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextLong(); 
        }
        for (int i = N-1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
        sc.close();
    }
}
