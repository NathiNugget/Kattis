import java.util.HashMap;
import java.util.Scanner;

public class T9spelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        HashMap<String, String> hMap = new HashMap<>(); 
        hMap.put("a", "2"); 
        hMap.put("b", "22"); 
        hMap.put("c", "222"); 
        hMap.put("d", "3"); 
        hMap.put("e", "33");
        hMap.put("f", "333");
        hMap.put("g", "4");
        hMap.put("h", "44");
        hMap.put("i", "444");
        hMap.put("j", "5");
        hMap.put("k", "55");
        hMap.put("l", "555");
        hMap.put("m", "6");
        hMap.put("n", "66");
        hMap.put("o", "666");
        hMap.put("p", "7");
        hMap.put("q", "77");
        hMap.put("r", "777");
        hMap.put("s", "7777");
        hMap.put("t", "8");
        hMap.put("u", "88");
        hMap.put("v", "888");
        hMap.put("w", "9");
        hMap.put("x", "99");
        hMap.put("y", "999");
        hMap.put("z", "9999");

        int i = sc.nextInt(); 
        sc.nextLine(); 
        String[] stringArr = new String[i]; 
        for (int j = 0; j < i; j++) {
            stringArr[j] = sc.nextLine();
        }
        sc.close();

        for (int j = 0; j < stringArr.length; j++) {
            StringBuilder sb = new StringBuilder(); 
            char previous = ' '; 
            for (char c : stringArr[j].toCharArray()) {
                if (hMap.get(("" + c)).contains(("" + previous))){
                    sb.append((" " + hMap.get("" + c))); 
                } else sb.append(("" + hMap.get(""+c))); 
            }
            System.out.println("Case #" + j + ": ");
        }
    }
}
