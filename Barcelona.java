import java.util.Scanner;

public class Barcelona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bagArray = new int[sc.nextInt()];
        int bagNo = sc.nextInt();
        int idx = 0;

        for (int i = 0; i < bagArray.length; i++) {
            bagArray[i] = sc.nextInt();
            if (bagArray[i] == bagNo) {
                idx = i;
            }
        }
        if (bagArray[0] == bagNo) {
            System.out.println("fyrst");
        } else if (bagArray[1] == bagNo) {
            System.out.println("naestfyrst");
        } else
            System.out.println(idx + 1 + " fyrst");

        sc.close();
    }
}
