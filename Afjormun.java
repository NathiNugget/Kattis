import java.util.Scanner;

public class Afjormun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            char[] input = sc.nextLine().toCharArray(); 
            for (int j = 0; j < input.length; j++) {
                if (j == 0){
                    sb.append(Character.toUpperCase(input[j])); 
                } else sb.append(Character.toLowerCase(input[j])); 
            }
            System.out.println(sb.toString());

            
        }
        sc.close(); 
    }
}
