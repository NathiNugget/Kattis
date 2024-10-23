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
        String currentCard = ""; 
        HashSet<String> cards = new HashSet<>(); 
        for (int i = 0; i < length; i += 3) {
            currentCard = input.substring(i, i+3); 
            
            cards.add(currentCard);
            if (currentCard.contains("P")){
                P--; 
                continue; 
            } else if (currentCard.contains("K")){
                K--; 
                continue; 
            } else if (currentCard.contains("H")){
                H--; 
                continue; 
            }
            else if (currentCard.contains("T")){
                T--; 
                continue;
            }
        }

        if (cards.size() != 4){
            System.out.println("GRESKA");
        } else {
            System.out.println(P + " " + K + " " + H + " " + T);
        }
        



        
    }
}
