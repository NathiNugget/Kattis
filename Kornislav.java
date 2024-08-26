import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[4];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);
        System.out.println(intArr[0] * intArr[2]);
        sc.close();

    }
}
