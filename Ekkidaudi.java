import java.util.Scanner;

public class Ekkidaudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] word1 = sc.nextLine().split("\\|");  
        String res1 = word1[0]; 
        String res2 = word1[1];  
        String[] word2 = sc.nextLine().split("\\|"); 
        sc.close();
        res1 += word2[0];
        res2 += word2[1]; 
        System.out.println(res1+ " " + res2);
    }
}
