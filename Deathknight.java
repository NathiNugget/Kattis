import java.util.Scanner;

public class Deathknight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battles = sc.nextInt(); 
        sc.nextLine(); 
        int trueWon = 0; 
        for (int i = 0; i < battles; i++) {
            if (!sc.nextLine().contains("CD")) trueWon++; 
        }
        sc.close();
        System.out.println(trueWon);
    }
}
