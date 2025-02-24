import java.util.Scanner;

public class Lettasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        sc.nextInt(); 
        int teams = sc.nextInt(); 
        sc.nextLine(); 
        String[] names = sc.nextLine().split(" ");
        int[] scores = new int[names.length];  
        for (int i = 0; i < teams; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[j] += sc.nextInt(); 
            }
        }

        int max = 0; 
        int maxIdx = 0; 
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max){
                maxIdx = i; 
                max = scores[i]; 
            } 
        }
        System.out.println(names[maxIdx]);

        sc.close();
    }



}
