import java.util.Scanner;

public class CPRnummer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] input = sc.nextLine().replaceAll("-", "").toCharArray(); 
        int[] intArr = {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] *= Integer.parseInt("" + input[i]); 
        }
        int sum = 0; 
        for (int i : intArr) {
            sum += i; 
        }
        sc.close();
        if (sum % 11 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
