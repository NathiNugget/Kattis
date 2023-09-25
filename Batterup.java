import java.util.Scanner;

public class Batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 
        double nextNum; 
        double sum = 0.0; 
        double div = num;
        for (int i = 0; i < num; i++) {
            nextNum = sc.nextDouble();
            if (nextNum > -1) {
                sum += nextNum; 
            }
            else div--; 
        }
        sc.close();
        System.out.println(sum/div);
    }
}
