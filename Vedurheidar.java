import java.util.Scanner;

public class Vedurheidar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int v = sc.nextInt(); 
        int n = sc.nextInt();
        String road;  
        int speed; 
        for (int i = 0; i < n; i++) {
            road = sc.next(); 
            speed = sc.nextInt(); 
            if (speed >= v) System.out.println(road + " opin");
            else System.out.println(road + " lokud");
        }
        sc.close();
    }
}
