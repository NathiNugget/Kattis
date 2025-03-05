import java.util.Scanner;

public class Whcihkindofnumberisit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        for (int i = 0; i < cases; i++) { 
            String output = ""; 
            int num = sc.nextInt(); 
            double numSquared = Math.sqrt(num); 
            if (num % 2 == 1 ){
                output += "O"; 
            }
            if (numSquared % num == 0){
                output += "S"; 
            }
            System.out.println(output.equals("") ? "EMPTY" : output);
        }
        sc.close();
    }
}
