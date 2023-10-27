import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        boolean foundHim = false; 
        for (int i = 1; i <= 5; i++) {
            if (sc.nextLine().contains("FBI")){
                foundHim = true; 
                System.out.println(i);
            }
            
        }
        if (!foundHim){
                System.out.println("HE GOT AWAY!");
            }
        sc.close();
    }
}
