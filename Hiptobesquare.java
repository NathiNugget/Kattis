import java.util.Scanner;

public class Hiptobesquare {
    static int layers = 1; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        for (int i = 0; i < cases; i++) {
            int squares = sc.nextInt(); 
            
            System.out.println(LargestLayersPossible(squares));
            layers = 1; 
        }
        sc.close();
    }

    public static int LargestLayersPossible(int squares){
        int sideLen = 3; 
        return Calculate(sideLen, squares); 

    }

    public static int Calculate(int sideLen, int squares){
        calculateLayers(sideLen, squares); 
        return layers; 
    }

    private static void calculateLayers(int sideLen, int squares) {
        int guess = (int) Math.pow(sideLen, 2)-1; 
        
        if (guess < squares) {
            layers++; 
            calculateLayers(sideLen+2, squares);
            return;  
        }
        if (guess > squares) layers--; 
    }

    

   
}
