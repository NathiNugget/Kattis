import java.util.Scanner;

public class Hitastig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers; i++) {
            int number = sc.nextInt();
            if (number > max) max = number; 
            else if (number < min) min = number; 
        }
        System.out.println(max + " " + min);

        sc.close();
    }
}
