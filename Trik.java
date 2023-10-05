import java.util.Scanner;

public class Trik {
    static boolean A = true; 
    static boolean B = false; 
    static boolean C = false; 

    private static void swap(char toSwap){
        if (toSwap == 'A') {
            if (A && !B){
                A = !A; 
                B = !B; 
            } 
            else if (B && !A){
                A = !A; 
                B = !B; 
            }
        } else if (toSwap == 'B'){
            if (B && !C){
                B = !B; 
                C = !C; 
            }
            else if (C && !B){
                B = !B; 
                C = !C; 
            }
        } else {
            if (A && !C){
                A = !A; 
                C = !C; 
            }
            else if (C && !A){
                A = !A; 
                C = !C; 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] input = sc.nextLine().toCharArray(); 
        sc.close();
        for (char c : input) {
            swap(c);
        }
        if (A) {
            System.out.println(1);
        }
        else if (B){
            System.out.println(2);
        }
        else if (C){
            System.out.println(3);
        }
    }
}
