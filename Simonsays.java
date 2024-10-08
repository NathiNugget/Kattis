import java.util.Scanner;

public class Simonsays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i = sc.nextInt(); 
        sc.nextLine(); 
        for (int j = 0; j < i; j++) {
            String output = sc.nextLine(); 
            int len1 = output.length(); 
            output = output.replaceFirst("Simon says", "");
            int len2 = output.length(); 
            if (len1 > len2){
                System.out.println(output);
            }
        }
        sc.close();
    }
}
