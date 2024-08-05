import java.util.Scanner;

public class Jobexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int expenses = 0;  
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input < 0){
                expenses += Math.abs(input); 
            }
        }
        sc.close();
        System.out.println(expenses);
    }
}
