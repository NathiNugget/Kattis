import java.util.Scanner;

public class Undeadoralive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        sc.close();
        if (input.contains(":)") && input.contains(":(")) {
            System.out.println("double agent");
        } else if (input.contains(":)")){
            System.out.println("alive");
        }
        else if (input.contains(":(")){
            System.out.println("undead");
        }
        else {
            System.out.println("machine");
        }
    }
}
