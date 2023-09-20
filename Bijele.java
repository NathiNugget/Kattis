import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[6]; 
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt(); 
        }
        sc.close();
        
        if (intArr[0] != 1) {
            intArr[0] = 1-intArr[0];
        } else {
            intArr[0] = 0; 
        }

        if (intArr[1] != 1) {
            intArr[1] = 1-intArr[1];
        } else {
            intArr[1] = 0; 
        }

        if (intArr[2] != 2) {
            intArr[2] = 2-intArr[2]; 
        } else {
            intArr[2] = 0; 
        }

        if (intArr[3] != 2) {
            intArr[3] = 2-intArr[3]; 
        } else {
            intArr[3] = 0; 
        }

        if (intArr[4] != 2) {
            intArr[4] = 2-intArr[4]; 
        } else {
            intArr[4] = 0; 
        }

        if (intArr[5] != 8) {
            intArr[5] = 8-intArr[5]; 
        } else {
            intArr[5] = 0;
        }

        System.out.println(intArr[0] + " " + intArr[1] + " " + intArr[2] + " " + intArr[3] + " " + intArr[4] + " " + intArr[5]);
    }
}