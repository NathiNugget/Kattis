import java.util.Scanner;

public class Bladra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println(v * t + 0.5 * a * Math.pow(t, 2));
        sc.close();
    }
}
