import java.util.Scanner;

public class Sith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        sc.nextLine(); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int diff = sc.nextInt(); 

        if (diff < 0 && a-b < 0) {
            System.out.println("JEDI");
        }
        else if (diff > 0 && a-b < 0){
            System.out.println("SITH");
        }
        else if (diff >= 0 && a-b >=0){
            System.out.println("VEIT EKKI");
        }
        sc.close();
    }
}
