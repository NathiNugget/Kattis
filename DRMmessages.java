import java.util.HashMap;
import java.util.Scanner;

public class DRMmessages {
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            hMap.put("" + (char) ('A' + i), i);
        }
        System.out.println(hMap);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String in1 = input.substring(0, input.length() / 2);
        String in2 = input.substring(input.length() / 2, input.length());
        int val1 = 0;
        int val2 = 0;

        for (int i = 0; i < in1.length(); i++) {
            val1 += hMap.get("" + in1.charAt(i));
            val2 += hMap.get("" + in2.charAt(i));
        }

        String newIn1 = "";
        for (char c : in1.toCharArray()) {
            System.out.println((c));

            if (c + val1 > 'Z') {
                newIn1 += (char) ((c + val1) - 26);
            } else {
                newIn1 += (char) (c + val1);
            }
        }

        String newIn2 = "";
        for (char c : in2.toCharArray()) {
            if (c + val2 > 'Z') {
                newIn2 += (char) ((c + val2) - 26);
            } else {
                newIn2 += (char) (c + val2);
            }
        }
        System.out.println(newIn1);
        System.out.println(newIn2);
        sc.close();
    }
}
