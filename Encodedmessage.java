import java.util.Scanner;

public class Encodedmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 

        String[] stringArr = new String[N];
        sc.nextLine();  

        for (int i = 0; i < stringArr.length; i++) {
            char[] charArr = sc.nextLine().toCharArray(); 
            int limit = (int) Math.sqrt(charArr.length); 
            int count = 0; 
            String[] partArr = new String[limit]; 
            String output = ""; 
            
            for (int j = 0; j < partArr.length; j++) {
                partArr[j] = ""; 
            }
            for (char c : charArr) {
                if (count == limit){
                    count = 0; 
                }
                partArr[count] += c; 
                count++; 
            }
            for (int j = limit-1; 0 <= j; j--) {
                output += partArr[j]; 
            }
            System.out.println(output);

        }

        
        sc.close();
    }
}
