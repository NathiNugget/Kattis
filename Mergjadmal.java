import java.util.Scanner;

public class Mergjadmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        if (input.contains("69") || input.contains("420")){
            System.out.println("Mergjad!");
        }
        else System.out.println("Leim!");
        sc.close();
    }
}
