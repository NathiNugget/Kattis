import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        sc.close();
        int P = 13;
        int K = 13;
        int H = 13;
        int T = 13;
        HashSet<String> cards = new HashSet<>();
        String[] cardArr = new String[4];
        cardArr[0] = input.substring(0, 3);
        cardArr[1] = input.substring(3, 6);
        cardArr[2] = input.substring(6, 9);
        cardArr[3] = input.substring(9, 12);
        for (String string : cardArr) {
            if (!cards.contains(string)) {
                cards.add(string);
                if (string.contains("P")) {
                    P--;
                } else if (string.contains("K")) {
                    K--;
                } else if (string.contains("H")) {
                    H--;
                } else if (string.contains("T")) {
                    T--;
                }
            } else {
                System.out.println("GRESKA");
                System.exit(0);
            }
        }

        // for (char c : input.toCharArray()) {
        // if (string.length() < 3){
        // string += c;
        // if (string.length() == 3){
        // if (!cards.contains(string)){
        // cards.add(string);
        // if (string.contains("P")){
        // P--;
        // }
        // else if (string.contains("K")){
        // K--;
        // }
        // else if (string.contains("H")){
        // H--;
        // }
        // else if (string.contains("T")){
        // T--;
        // }
        // } else {
        // System.out.println("GRESKA");
        // System.exit(0);
        // }
        // }

        // } else {
        // string = "";
        // string += c;
        // }
        // }
        String string = P + " " + K + " " + H + " " + T;
        System.out.println(string.trim());

    }
}