import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt(); 
        for (int i = 0; i < lim; i++) {
            System.out.println(i+1 + " Abracadabra");
        }
        sc.close();
    }
}
