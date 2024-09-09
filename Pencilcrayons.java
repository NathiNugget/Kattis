import java.util.HashSet;
import java.util.Scanner;

public class Pencilcrayons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int K = sc.nextInt();
        sc.nextLine(); // Advance Scanner to next line; 
        String[][] pencils = new String[N][K];  
        int pencilsToRemove = 0; 
        HashSet<String> lineColors = new HashSet<>(); 
        for (int i = 0; i < N; i++) {
            pencils[i] = sc.nextLine().split(" ");
        }
        sc.close();

        for (int i = 0; i < pencils.length; i++) {
            lineColors.clear();
            for (int j = 0; j < pencils[i].length; j++) {
                if (lineColors.contains(pencils[i][j])){
                    pencilsToRemove++; 
                     
                } else lineColors.add(pencils[i][j]);
            }
        }
        System.out.println(pencilsToRemove);
    }
}
