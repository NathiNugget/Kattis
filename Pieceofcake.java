import java.util.Scanner;

public class Pieceofcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int h = sc.nextInt();
        int v = sc.nextInt();
        int[] cakeArr = new int[4]; 
        cakeArr[0] = v*h; 
        cakeArr[1] = n*n-2*((n-v)*h);
        cakeArr[2] = n*n-2*((n-v)*h);
        cakeArr[3] = n*n - cakeArr[0] - 2*cakeArr[1];
        int max = cakeArr[0]; 
        if (max < cakeArr[1]) {
            max = cakeArr[1];
        } else {
            if (max < cakeArr[3]) {
                max = cakeArr[3];
            }
        }
        System.out.println(max*4);
    
        sc.close();
    }
}
