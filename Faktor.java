import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double A = sc.nextDouble(); 
        double I = sc.nextDouble()-1; 
        System.out.println((int) (1 + (A * I)));
        sc.close();
    }
}
