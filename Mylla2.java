import java.util.Scanner;

public class Mylla2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] input = new char[3][3]; 
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine().toCharArray(); 
        }
        sc.close(); 

        System.out.println(checkFor('O', input) ? "Jebb" : "Neibb");
        
    }

    private static boolean checkFor(char c, char[][] input) {
        // hori
        if (input[0][0] == c && input[0][1] == c && input[0][2] == c){
            return true; 
        }
        else if (input[1][0] == c && input[1][1] == c && input[1][2] == c){
            return true; 
        }
        else if (input[2][0] == c && input[2][1] == c && input[2][2] == c){
            return true; 
        }
        // vert
        else if (input[0][0] == c && input[1][0] == c && input[2][0] == c){
            return true; 
        }
        else if (input[0][1] == c && input[1][1] == c && input[2][1] == c){
            return true; 
        }
        else if (input[0][2] == c && input[1][2] == c && input[2][2] == c){
            return true; 
        }

        // Diag
        else if (input[0][0] == c && input[1][1] == c && input[2][2] == c){
            return true; 
        }
        else if (input[0][2] == c && input[1][1] == c && input[2][0] == c){
            return true; 
        }

        return false; 
    }

    
}
