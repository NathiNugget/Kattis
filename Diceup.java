import java.util.Scanner;

public class Diceup {
    static int[][] buffArr;
    static int maxRn = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int M = sc.nextInt(); 
        
        int[] intArr = new int[400]; 

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                intArr[i+j]++; 
            }
        }

        int max = 0; 

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max){
                max = intArr[i]; 
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == max){
                System.out.println(i);
            }
        }
        sc.close();


        
        
        
        
        
    }
}
