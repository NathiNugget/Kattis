import java.util.Scanner;

public class Dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emma = 0;
        int gunnar = 0;
        for (int i = 0; i < 4; i++) {
            gunnar += sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            emma += sc.nextInt();
        }
        if (emma > gunnar) {
            System.out.println("Emma");
        } else if (emma < gunnar) {
            System.out.println("Gunnar");
        } else
            System.out.println("Tie");
        sc.close();
    }
}
