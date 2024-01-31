import java.util.Scanner;

public class Provincesandgold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int G = sc.nextInt(); 
        int S = sc.nextInt(); 
        int C = sc.nextInt(); 
        int sum = G*3 + S*2 + C; 
        sc.close();
        if (sum >= 8){
            System.out.println("Province or Gold");
        }
        else if (sum <= 1){
            System.out.println("Copper");
        }
        else if (sum < 3 && sum >= 1) System.out.println("Estate or Copper");
        else if (sum < 5 && sum >= 3) System.out.println("Estate or Silver");
        else if (sum < 6 && sum >= 5) System.out.println("Duchy or Silver");
        else if (sum < 8 && sum >= 6) System.out.println("Duchy or Gold");
      
    }
}
