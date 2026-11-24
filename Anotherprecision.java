import java.util.Scanner;

public class Anotherprecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble() / 2.0;
        double A = (double) ((((double) 4.0 / (double) 3.0) * (double) Math.PI * ((double) Math.pow(r, (double) 3.0)))
                / (double) 2.0);
        System.out.println(A);

        sc.close();
    }
}
