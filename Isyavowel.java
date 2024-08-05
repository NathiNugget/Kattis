import java.util.Scanner;

public class Isyavowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] inputArr = sc.nextLine().toCharArray(); 
        int non = 0; 
        int yon = 0; 
        for (char c : inputArr) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                non++; 
            }
            if(c == 'y' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                yon++; 
            }
        }
        System.out.println(non + " " + yon);
        sc.close();
    }
}
