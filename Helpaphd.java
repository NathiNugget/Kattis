import java.util.Scanner;

public class Helpaphd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int nums = sc.nextInt(); 
        sc.nextLine();
        for (int i = 0; i < nums; i++) {
            String[] input = sc.nextLine().split("\\+"); 
        if (input.length > 1){
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        } else {
            System.out.println("skipped");
        }
        }
        
        sc.close();
    }
}
