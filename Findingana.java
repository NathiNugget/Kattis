import java.util.Scanner;

public class Findingana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine();
        sc.close();
        System.out.println(input.substring(input.indexOf("a"), input.length())); 
    }
}