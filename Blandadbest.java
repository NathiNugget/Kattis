import java.util.Scanner;

public class Blandadbest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int types = sc.nextInt();
        sc.nextLine();
        String[] meats = new String[types];
        for (int i = 0; i < types; i++) {
            meats[i] = sc.nextLine();
        }
        sc.close();
        if (meats.length < 2) {
            System.out.println(meats[0]);
        } else
            System.out.println("blandad best");
    }
}
