import java.util.Scanner;

public class Skammstofun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = sc.nextInt();
        sc.nextLine();
        String[] stringArr = sc.nextLine().split(" ");
        sc.close();
        String output = "";
        for (String string : stringArr) {
            if (Character.isUpperCase(string.charAt(0)))
                output += string.charAt(0);
        }
        System.out.println(output);
    }
}
