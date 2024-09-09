import java.util.Scanner;

public class Takkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        sc.close();
        if (a == b ){
            System.out.println("WORLD WAR 3!");
        }
        else {
            System.out.println(a > b ? "MAGA!" : "FAKE NEWS!");
        }

    }
}
