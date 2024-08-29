import java.util.Scanner;

public class Hakkari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt(); 
        int cols = sc.nextInt(); 
        int num = 0; 
        sc.nextLine(); 
        boolean[][] mines = new boolean[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            char[] line = sc.nextLine().toCharArray(); 
            for (int j = 0; j < line.length; j++) {
                
                if (line[j] == '*'){
                    num++; 
                    mines[i][j] = true; 
                }
            }
        }
        sc.close();
        System.out.println(num);
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                if (mines[i][j]){
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }


    }
}
