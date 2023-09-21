import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        String[] stringArr = new String[N]; 
        for (int i = 0; i < N; i++){
            stringArr[i] = sc.next();
        }
        for (int i = 0; i < stringArr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(stringArr[i]); 
            }
        }
        sc.close();
    }
}
