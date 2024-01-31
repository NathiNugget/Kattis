import java.util.Scanner;

public class Kikiboba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kiki = 0;
        int boba = 0;
        String input = sc.nextLine();
        for (char c : input.toCharArray()) {
            if (c == 'k')
                kiki++;
            if (c == 'b')
                boba++;
        }
        if (!input.contains("k") && !input.contains("b")) {
            System.out.println("none");
        } else {
            if (kiki == boba) {
                System.out.println("boki");
            } else if (kiki > boba)
                System.out.println("kiki");
            else
                System.out.println("boba");
        }
        sc.close();
    }
}
