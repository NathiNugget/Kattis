import java.util.ArrayList;
import java.util.Scanner;

public class Ooohisee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt(); 
        int cols = sc.nextInt(); 
        sc.nextLine(); 
        char[][] input = new char[rows][cols]; 
        for (int i = 0; i < rows; i++) {
            input[i] = sc.nextLine().toCharArray(); 
        }

        ArrayList<Integer[]> matches = new ArrayList<>(); 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < rows-1 && i > 0 && j < cols-1 && j > 0){
                    if(input[i][j] == '0'){
                        if (input[i-1][j-1] == 'O' && input[i-1][j] == 'O' && input[i-1][j+1] == 'O'
                        && input[i][j-1] == 'O' && input[i][j+1] == 'O'
                        && input[i+1][j-1] == 'O' && input[i+1][j] == 'O' && input[i+1][j+1] == 'O'
                        ){
                            matches.add(new Integer[]{i,j}); 
                        }
                    }
                }
                
            }
        }

        if (matches.size() == 1){
            Integer[] arr = matches.get(0); 
            System.out.println((arr[0] + 1) + " " + (arr[1]+1));
        }
        else if (matches.size() > 1) System.out.println("Oh no! " + matches.size() + " locations");
        else System.out.println("Oh no!");


        sc.close();
    }
}
