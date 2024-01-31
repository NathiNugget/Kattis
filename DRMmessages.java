import java.util.Scanner;

public class DRMmessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        char[] inputArr0 = (input.substring(0, input.length()/2)).toCharArray(); 
        char[] inputArr1 = (input.substring(input.length()/2, input.length())).toCharArray();
        

        int toMove0 = 0; 
        for (char c : inputArr0) {
            toMove0 += c-65; 
        }
        toMove0 %= 26; 
        
        

        int toMove1 = 0; 
        for (char c : inputArr1) {
            toMove1 += c-65; 
        }
        toMove1 %= 26; 
        
        
        StringBuilder finalString0 = new StringBuilder(2000);
        char buffer;

        for (char c : inputArr0) {
            buffer = c;
            
            
            // while(f < toMove0){
            //     if ('Z' - buffer > toMove0){
            //         buffer += toMove0 - f; 
            //         f += toMove0 - f; 
            //     }
            //     else {
            //         buffer += 'Z' - buffer; 
            //     }
            // }
            for (int i = 0; i < toMove0; i++) {
                if(buffer != 'Z'){
                    buffer++;       
                }
                else {
                    buffer = 'A'; 
                }
            }
            finalString0.append(buffer); 
        }
        char[] finalArr = finalString0.toString().toCharArray(); 
        

        StringBuilder finalString1 = new StringBuilder(2000); 
        
         
        for (char c : inputArr1) {
            buffer = c; 
            for (int i = 0; i < toMove1; i++) {
                if(buffer != 'Z'){
                    buffer++; 
                }
                else {
                    buffer = 'A'; 
                }
            }
            
            finalString1.append(buffer); 
            

        }
       
        int toLook = 0; 
        StringBuilder res = new StringBuilder(2000);
        int toMove;  
        for (char c : finalArr) {
            buffer = c; 
            toMove = finalString1.charAt(toLook)-65; 
            for (int i = 0; i < toMove; i++) {
                if(buffer != 'Z'){
                    buffer++; 
                    
                    
                }
                else {
                    buffer = 'A'; 
                    
                }
            }
            res.append(buffer); 
            toLook++; 

        }
        System.out.println(res);
        
        sc.close();
    }
}
