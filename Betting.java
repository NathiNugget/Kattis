import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double num = sc.nextInt(); 
        sc.close();
        System.out.println(100.0/num); 
        System.out.println(100/(100-num));
    }
}
