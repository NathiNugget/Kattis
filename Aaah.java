import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int can = sc.nextLine().length(); 
        int req = sc.nextLine().length(); 
        sc.close();
        System.out.println(can >= req ? "go" : "no");
    }
}
