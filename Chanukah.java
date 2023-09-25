import java.util.Scanner;

public class Chanukah {

    private static int calc(int days){
        int toBeLit = 1;
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += toBeLit*1+1; 
            toBeLit++;
        }
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        
        for (int i = 0; i < cases; i++) {
            sc.nextInt(); 
            System.out.println(i+1  + " " + calc(sc.nextInt())); 
        }
        sc.close();
    }
}
