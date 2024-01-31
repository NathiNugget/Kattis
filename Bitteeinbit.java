import java.util.Scanner;

public class Bitteeinbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        sc.close();
        if(input.contains("1")){
            System.out.println(1);
        } else {System.out.println(0);}
        
    }
}
