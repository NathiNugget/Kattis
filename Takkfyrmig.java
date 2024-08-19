import java.util.Scanner;

public class Takkfyrmig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < times; i++) {
            String name = sc.nextLine();
            System.out.println("Takk " + name);
        }
        sc.close();
    }
}
