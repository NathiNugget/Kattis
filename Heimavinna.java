import java.util.Scanner;

public class Heimavinna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] input = sc.nextLine().split(";"); 
        sc.close();
        int numberOfProblemsToSolve = 0; 

        for (String string : input) {
            if (string.contains("-")){
                int idx = string.indexOf("-"); 
                int start = Integer.parseInt(string.substring(0, idx))-1;
                int end = Integer.parseInt(string.substring(idx+1, string.length())); 
                numberOfProblemsToSolve += end-start; 
            } else numberOfProblemsToSolve++; 

        }
        System.out.println(numberOfProblemsToSolve);
    }
}
