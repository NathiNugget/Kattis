import java.util.Scanner;

public class Jebb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() % 10 == 0 ? "Jebb" : "Neibb");
        sc.close();
    }
}
