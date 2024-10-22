import java.util.Scanner;

public class Callforproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int res = 0; 
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            int nextNum = sc.nextInt(); 
            if (nextNum % 2 != 0){
                res++; 
            }
        }
        sc.close();
        System.out.println(res);
    }
}
