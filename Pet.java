import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] intArr = {0, 0, 0, 0, 0}; 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                intArr[i] += sc.nextInt(); 
            }
        }
        sc.close();
        int index = 0; 
        int max = 0; 
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] >= max) {
                index = i; 
                max = intArr[i]; 
            }
        }
        System.out.println(index + 1 + " " + max);


        
    }
}
