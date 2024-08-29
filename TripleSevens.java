import java.util.Scanner;

public class TripleSevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        boolean sevensNotFound = false; 
        for (int i = 0; i < 3; i++) {
            boolean foundThisTime = false; 
            for (int j = 0; j < n; j++) {
                int n1 = sc.nextInt(); 
                if (n1 == 7){
                    foundThisTime = true; 
                }
            }
            if (!foundThisTime){
                sevensNotFound = true; 
                break; 
            }
        }
        System.out.println(sevensNotFound ? "0" : "777");

        sc.close();
    }
}
