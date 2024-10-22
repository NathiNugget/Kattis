import java.util.Scanner;

public class Composedrhythms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int beatsInput = sc.nextInt(); 
        sc.close();
        int totalGroups = 0; 
        StringBuilder sb = new StringBuilder(beatsInput/2);
        for (int i = 0; i < beatsInput;) {
            
            if (beatsInput%3 == 0){
                sb.append(3 + " "); 
                beatsInput -=3; 
            }
            else {
                sb.append(2 + " ");
                beatsInput-=2; 
                    
            }
            totalGroups++; 
        }
        System.out.println(totalGroups);
        System.out.println(sb.toString().trim());

        
    }
}
