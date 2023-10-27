import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int[] intArr = new int[N];
        int[] diceArr1 = new int[6]; 
        int[] diceArr2 = new int[6]; 
        double chance = 0.0; 
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt(); 
        }
        for (int i = 0; i < diceArr1.length; i++) {
            diceArr1[i] = i+1;
            diceArr2[i] = i+1;  
        }

        for (int i = 0; i < diceArr1.length; i++) {
            for (int j = 0; j < diceArr2.length; j++) {
                for (int c : intArr) {
                    if (c == diceArr1[i] + diceArr2[j]){
                        chance += 1; 
                    }
                }
            }
        }
        
        System.out.println((double) (chance/36));

        sc.close();
    }
}
