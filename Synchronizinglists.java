import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> fList = new ArrayList<>(); 
        ArrayList<Integer> sList = new ArrayList<>();
        ArrayList<Integer> fListCopy = new ArrayList<>(); 
        ArrayList<Integer> sListCopy = new ArrayList<>(); 
        HashMap<Integer, Integer> hMap = new HashMap<>(); 
        StringBuilder sb = new StringBuilder(); 
        while (true) {
            int len = sc.nextInt(); 
            if (len != 0){
                if (sb.length() != 0){
                    sb.append("\r\n"); 
                }
                // Ready collections
                 fList.clear();
                 sList.clear();
                 hMap.clear();
                 fListCopy.clear();
                 sListCopy.clear();

                 // Add elements from first list to copy
                for (int i = 0; i < len; i++) {
                    int toAdd = sc.nextInt(); 
                    fList.add(toAdd); 
                    fListCopy.add(toAdd); 
                } // Same with second list
                for (int i = 0; i < len; i++) {
                    int toAdd = sc.nextInt(); 
                    sList.add(toAdd); 
                    sListCopy.add(toAdd); 
                } 
                // sort first list copy
                fListCopy.sort((x, y) -> {
                    if (x > y) return 1; 
                    else if (x == y) return 0; 
                    return -1; 
                });
                // sort second list copy
                sListCopy.sort((x, y) -> {
                    if (x > y) return 1; 
                    else if (x == y) return 0; 
                    return -1; 
                });

                for (int i = 0; i < len; i++) {
                    hMap.put((Integer) fListCopy.get(i), sListCopy.get(i)); 
                }

                
                for (Integer integer : fList) {
                    sb.append(hMap.get(integer) + "\r\n"); 
                }
                
                

            } else {
                break;
            }
             
        }
        sc.close();
        sb.setLength(sb.length()-2);
        String output = sb.toString(); 
        System.out.println(output);
    }
}
