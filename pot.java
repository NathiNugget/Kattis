import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int res = 0; 
        String input;  
        for (int i = 0; i < n; i++) {
            input = sc.next(); 
            res +=  Math.pow(Integer.parseInt(input.substring(0, input.length()-1)), Integer.parseInt(input.substring(input.length()-1))); 
            
        }
        System.out.println(res); 

        sc.close();
    }
}
