import java.util.Scanner;

public class Umferd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cellsPerLane = sc.nextInt(); 
        int n = sc.nextInt(); 
        int empty = 0; 
        sc.nextLine(); 
        double sum = 0.0; 
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine(); 
            empty = 0; 
            for (char c : line.toCharArray()) {
                if (c == '.') empty++; 
            }
            sum += (double) empty/cellsPerLane; 
        }
        
        System.out.println(sum/n);
        sc.close();
    }
}
