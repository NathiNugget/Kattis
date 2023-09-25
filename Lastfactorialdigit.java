import java.util.Scanner;

public class Lastfactorialdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        int num = 1; 
        int res = 1; 
        for (int i = 0; i < cases; i++) {
            num = sc.nextInt(); 
            res = 1; 
            for (int j = 1; j <= num; j++) {
                res *= j; 
            }
            String result = "" + res; 
            System.out.println(result.substring(result.length()-1, result.length()));
        }
        sc.close();
    }
}