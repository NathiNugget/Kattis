import java.util.Scanner;

public class Grassseed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        float C = sc.nextFloat(); 
        int L = sc.nextInt(); 
        double total_cost = 0; 
        for (int i = 0; i < L; i++) {
            total_cost += sc.nextFloat() * sc.nextFloat() * C; 
        }
        sc.close();
        System.out.println(total_cost);
    }
}
