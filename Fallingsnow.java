import java.util.Scanner;

public class Fallingsnow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        sc.nextLine(); 
        int[] snowPerColumn = new int[M];
        char[][] snowGrid = new char[N][M]; 

        for (int i = 0; i < N; i++) {
            snowGrid[i] = sc.nextLine().toCharArray(); 
        }
        sc.close();

        for (int i = 0; i < snowGrid.length; i++) {
            for (int j = 0; j < snowGrid[0].length; j++) {
                if (snowGrid[i][j] == 'S'){
                    snowPerColumn[j]++; 
                }
            }
        }

        for (int i = 0; i < snowGrid.length; i++) {
            StringBuilder sb = new StringBuilder(); 
            for (int j = 0; j < snowGrid[0].length; j++) {
                if (snowPerColumn[j] >= snowGrid.length - i){
                    sb.append('S'); 
                } else sb.append('.'); 
            }
            System.out.println(sb.toString());
        }


        


    }
}
