import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int hour = sc.nextInt(); 
        int minute = sc.nextInt(); 
        sc.close();
        if (minute < 45) {
            if (hour == 0) {
                System.out.println(23 + " " + (60+(minute-45)));  
            } else {
                System.out.println(hour - 1 + " " + (60+(minute-45)));
            }
        } else {
            System.out.println(hour + " " + (minute-45));
        }
        
    }
}
