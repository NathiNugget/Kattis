import java.util.Scanner;

public class Shandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int left = sc.nextInt(); 
        int right = sc.nextInt(); 
        sc.close();
        if (left < right){
            System.out.println(left*2);
        }
        else System.out.println(right*2);

    }
}
