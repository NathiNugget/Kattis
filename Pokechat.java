
import java.util.Scanner;

public class Pokechat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String code = sc.nextLine(); 
        String input = sc.nextLine(); 
        sc.close();
        int[] intArr = new int[input.length()/3]; 
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(input.substring(i*3, i*3+3)); 
        }

        String result = ""; 
        for (int i : intArr) {
            result += code.substring(i-1, i);  
        }
        System.out.println(result);




        
        
        

    }
}
