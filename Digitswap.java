import java.util.Scanner;

public class Digitswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] charArr = sc.nextLine().toCharArray(); 
        sc.close();
        System.out.println("" + charArr[1] + "" + charArr[0]); 
    }
}
