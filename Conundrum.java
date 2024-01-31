import java.util.Scanner;

public class Conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] charArr = sc.nextLine().toCharArray(); 
        int days = 0; 
        for (int i = 0; i < charArr.length; i++) {
            if (i % 3 == 0) {
                if (charArr[i] == 'P'){
                    continue; 
                }
                else days++; 
            } 
            if (i % 3 == 1){
                if (charArr[i] == 'E') {
                    continue;
                }
                else days++;
            }  
            if (i % 3 == 2) {
                if (charArr[i] == 'R') {
                    continue; 
                } 
                else days++; 
            }
            
        }
        System.out.println(days);

        sc.close();
    }
}
