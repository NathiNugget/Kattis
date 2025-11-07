import java.util.Scanner;

public class Virus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f_name = sc.nextLine().trim();
        StringBuilder v_name = new StringBuilder(sc.nextLine().trim());
        boolean check = false;
        var some_chars = f_name.toCharArray();
        sej: for (char c : some_chars) {
            int idx = v_name.indexOf("" + c);
            if (idx == -1) {

                check = true;
                break sej;

            }
            v_name = v_name.replace(0, idx + 1, "");

        }

        System.out.println(!check ? "Ja" : "Nej");

        sc.close();

    }
}
