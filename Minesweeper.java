import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt(); 
        int cols = sc.nextInt(); 
        int k = sc.nextInt(); 

        boolean[][] bombs = new boolean[rows][cols]; 
        for (int i = 0; i < k; i++) {
            rows = sc.nextInt()-1; 
            cols = sc.nextInt()-1; 
            bombs[rows][cols] = true; 
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bombs.length; i++) {
            
            for (int j = 0; j < bombs[i].length; j++) {
                if (bombs[i][j]) {
                    sb.append('*');
                } else sb.append('.');
            }
            System.out.println(sb);
            sb.setLength(0);
        }

        sc.close();
    }
}