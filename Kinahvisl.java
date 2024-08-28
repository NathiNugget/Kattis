import java.util.Scanner;

public class Kinahvisl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int kidsNeeded = 1; 

        char[] origWord = sc.nextLine().toCharArray(); 
        char[] newWord = sc.nextLine().toCharArray(); 
        sc.close();
        for (int i = 0; i < origWord.length; i++) {
            if (origWord[i] != newWord[i]) {
                kidsNeeded++; 
            }
        }
        System.out.println(kidsNeeded);

        
    }
}
