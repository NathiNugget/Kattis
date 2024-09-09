import java.util.Scanner;

public class Laegdyfirlandinu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt(); 
        int width = sc.nextInt(); 
        int[][] pressures = new int[lines][width]; 
        boolean lowPres = false; 
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < width; j++) {
                pressures[i][j] = sc.nextInt(); 
            }
        }
        sc.close();

        for (int i = 0; i < pressures.length; i++) {
            for (int j = 0; j < pressures[0].length; j++) {
                if (i != 0 && i <= pressures.length-2 && j != 0 && j <= pressures[0].length-2){
                    if (lowPres(pressures[i][j], pressures[i][j-1], pressures[i][j+1], pressures[i+1][j], pressures[i-1][j])){
                        lowPres = true; 
                        break; 
                    }
                }
            }
            if (lowPres) break; 
        }
        
        System.out.println(lowPres ? "Jebb" : "Neibb");
    }

    private static boolean lowPres(int mid, int left, int right, int up, int down) {
        // TODO Auto-generated method stub

        if (mid < left && mid < right && mid < up && mid < down){
            return true; 
        }
        return false; 
    }
}
