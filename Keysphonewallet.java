import java.util.ArrayList;
import java.util.Scanner;

public class Keysphonewallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        items.add("keys");
        items.add("phone");
        items.add("wallet");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            items.remove(sc.nextLine());
        }
        if (items.size() == 0) {
            System.out.println("ready");
        } else {
            for (String string : items) {
                System.out.println(string);
            }
        }
        sc.close();
    }
}
