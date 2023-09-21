import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();  
        
        int j = 0; 
        for (int i = 0; i < num; i++) {
            if (sc.nextInt() < 0) {
                j++; 
            }
        }
        sc.close();
        System.out.println(j);
    }
}
