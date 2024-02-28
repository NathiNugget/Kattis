import java.util.Scanner;

public class Janitortroubles {
    public static double calArea(double a, double b, double c, double d){
        double p = (a + b + c + d)/2; 
        return Math.sqrt(((p - a) * (p - b) * (p - c) * (p - d)));  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double a = sc.nextInt(); 
        double b = sc.nextInt(); 
        double c = sc.nextInt(); 
        double d = sc.nextInt(); 
        sc.close();
        System.out.println(calArea(a, b, c, d));

    }
}
