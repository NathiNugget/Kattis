import java.util.Scanner;

public class Hipphipphurra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
        sc.close();
    }
}
