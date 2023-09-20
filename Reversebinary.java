import java.util.Scanner;

public class Reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String binary = Integer.toBinaryString(sc.nextInt()); 
        sc.close();
        StringBuilder sb = new StringBuilder(binary); 
        char[] charArr = sb.toString().toCharArray(); 
        int sum = 0; 
        for (int i = charArr.length-1 ; i >= 0; i--) {
            sum += Character.getNumericValue(charArr[i]) * Math.pow(2, i); 
        }

        System.out.println(sum);
    }
}
