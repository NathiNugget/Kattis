import java.util.Scanner;

public class Harshadnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int harshad = 0; 
        char[] digits = String.valueOf(n).toCharArray(); 
        for (char c : digits) {
            harshad += Character.getNumericValue(c); 
        }
        if(n%harshad == 0){
            System.out.println(n);
        } else{
            int harshadbuffer = n; 
            while (true) {
                harshad = 0; 
                digits = String.valueOf(harshadbuffer).toCharArray(); 
                for (char c : digits) {
                    harshad += Character.getNumericValue(c); 
                }
                if (harshadbuffer % harshad == 0){
                    System.out.println(harshadbuffer);
                    break; 
                }
                harshadbuffer++; 
            }
        }
        
        
        sc.close();
    }
}
