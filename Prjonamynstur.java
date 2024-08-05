import java.util.Scanner;

public class Prjonamynstur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int chars = sc.nextInt();
        sc.nextLine(); 
        int length = 0;  
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine(); 
            for (char c : input.toCharArray()) {
                switch (c) {
                    case '.':
                        length += 20; 
                        break;
                    case 'O': 
                        length += 10; 
                        break; 
                    case '\\': 
                        length += 25; 
                        break; 
                    case '/': 
                        length += 25; 
                        break; 
                    case 'A': 
                        length += 35; 
                        break; 
                    case '^': 
                        length += 5; 
                        break;
                    case 'v': 
                        length += 22; 
                        break; 

                    default:
                        break;
                }
            }
        }
        System.out.println(length);
        sc.close();
    }
}
