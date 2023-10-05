import java.util.Scanner;

public class Eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] inputArr = sc.nextLine().split("\\(\\)");
        sc.close();
        if (inputArr[0].length() == inputArr[1].length()) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}
