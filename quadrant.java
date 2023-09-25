import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cord1 = sc.nextInt(); 
        int cord2 = sc.nextInt(); 
        if (cord1 > 0 && cord2 > 0) {
            System.out.println(1); 
        } else if (cord1 < 0 && cord2 > 0){
            System.out.println(2);
        }

        else if(cord1 < 0 && cord2 < 0){
            System.out.println(3); 
        }
        else {
            System.out.println(4);
        }

        sc.close();
    }
}
