import java.util.Scanner;

public class Skak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] petra = new int[]{sc.nextInt(), sc.nextInt()}; 
        int[] gartra = new int[]{sc.nextInt(), sc.nextInt()}; 
        sc.close();
        int movesNeeded = 0; 
        for (int i = 0; i < gartra.length; i++) {
            if (petra[i] != gartra[i]){
                movesNeeded++; 
            }
        }
        System.out.println(movesNeeded);
    }
}
