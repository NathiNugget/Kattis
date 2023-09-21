import java.util.Scanner;

public class Metronome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double num = sc.nextDouble(); 
        System.out.println(num/4.0); 
        sc.close();
    }
}
