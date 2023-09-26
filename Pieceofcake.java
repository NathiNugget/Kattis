import java.util.Scanner;

public class Pieceofcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); //length of side
        int h = sc.nextInt(); //length of cut
        int v = sc.nextInt(); //length of cut
        int[] cakeArr = new int[4]; 
        cakeArr[0] = v*h; 
        cakeArr[1] = (n-v)*h; 
        cakeArr[2] = (n-h)*v; 
        cakeArr[3] = n*n-(cakeArr[0] + cakeArr[1] + cakeArr[2]); 
        int max = cakeArr[0]; 
        if (max < cakeArr[1]) {
            max = cakeArr[1]; 
        } 
        if (max < cakeArr[2]){
            max = cakeArr[2]; 
        }
        if (max < cakeArr[3]){
            max = cakeArr[3]; 
        }
        System.out.println(max*4);
    
        sc.close();
    }
}
