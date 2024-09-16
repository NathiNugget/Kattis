import java.util.ArrayList;
import java.util.Scanner;

public class Synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> fList = new ArrayList<>(); 
        ArrayList<Integer> sList = new ArrayList<>();
        while (true) {
            int len = sc.nextInt(); 
            if (len != 0){
                 fList.clear();
                 sList.clear();
                for (int i = 0; i < len; i++) {
                    fList.add(sc.nextInt()); 
                }
                for (int i = 0; i < len; i++) {
                    sList.add(sc.nextInt()); 
                }
                sList.sort((x, y) -> {
                    if (x > y) return 1; 
                    else if (x == y) return 0; 
                    return -1; 
                }); 
                
                for (int num : sList) {
                    System.out.println(num);
                }
                System.out.println();
                

            } else {
                break;
            }
             
        }
        sc.close();
    }
}
