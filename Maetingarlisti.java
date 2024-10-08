import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maetingarlisti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String[][] names = new String[r][c];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine().split(" ");
        }
        int[][] idx = new int[r][c];
        ArrayList<String> namesList = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            namesList = new ArrayList<>(Arrays.asList(names[i]));
            for (int j = 0; j < idx[i].length; j++) {
                String nameOnLine = sc.nextLine();
                if (j < 2) {
                    idx[i][j] = namesList.indexOf(nameOnLine);
                }
            }
            System.out.println(idx[i][0] > idx[i][1] ? "right" : "left");
        }

        sc.close();
    }
}
