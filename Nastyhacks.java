import java.util.Scanner;

public class Nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        int r;
        int e; 
        int c; 
        for (int i = 0; i < cases; i++) {
            r = sc.nextInt(); 
            e = sc.nextInt(); 
            c = sc.nextInt(); 
            if (e-c > r) {
                System.out.println("advertise");
            } else if (e-c == r){
                System.out.println("does not matter");
            }
            else System.out.println("do not advertise");
        }
        sc.close();
    }
}
