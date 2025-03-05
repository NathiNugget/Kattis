import java.util.Scanner;

public class Equalshots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int aVol = 0; 
        int bVol = 0; 
        for (int i = 0; i < a; i++) {
            aVol += sc.nextInt()*sc.nextInt(); 
        }
        for (int i = 0; i < b; i++) {
            bVol += sc.nextInt()*sc.nextInt(); 
        }
        System.out.println(aVol == bVol ? "same" : "different");

        sc.close();
    }
}
