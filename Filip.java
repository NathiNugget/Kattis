import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        StringBuilder sb1 = new StringBuilder("" + sc.nextInt()).reverse(); 
        StringBuilder sb2 = new StringBuilder("" + sc.nextInt()).reverse(); 
        sc.close();
        if (Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
            System.out.println(sb1);
        }
        else {
            System.out.println(sb2);
        }
        
    }
}
