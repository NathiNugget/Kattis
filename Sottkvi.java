import java.util.Scanner;

public class Sottkvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int K = sc.nextInt(); 
        int D = sc.nextInt(); 
        int canMakeIt = 0; 
        for (int i = 0; i < N; i++) {
            if (D+K >= sc.nextInt()+14) canMakeIt++; 
        }
        sc.close();
        System.out.println(canMakeIt);
    }
}
