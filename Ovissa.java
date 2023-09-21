import java.util.Scanner;

public class Ovissa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] charArr = sc.nextLine().toCharArray(); 
        sc.close();
        System.out.println(charArr.length); 
    }
}
