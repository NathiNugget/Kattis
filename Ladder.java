import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int H = sc.nextInt(); 
        int V = sc.nextInt();
        sc.close();
        System.out.println((int)Math.ceil(H/Math.sin((Math.toRadians(V))))); 
        
    }
}
