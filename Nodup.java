import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nodup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<String> list = new ArrayList<>(); 
        String[] stringArr = sc.nextLine().split(" "); 
        boolean repeat = false; 
        for (String string : stringArr) {
            if (!list.contains(string)) list.add(string); 
            else repeat = true; 
        }

        if (repeat) System.out.println("no");
        else System.out.println("yes");

        
        sc.close();
    }
}
