import java.util.Scanner;

public class Asciikassi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        String outStr = "+";
        for (int i = 0; i < n; i++) {
             outStr += "-";
        }
        outStr += "+"; 
        System.out.println(outStr);
        String lineStr = "|"; 
        for (int i = 0; i < n; i++) {
            lineStr += " "; 
        }
        lineStr += "|"; 
        for (int i = 0; i < n; i++) {
            System.out.println(lineStr);
        }
        System.out.println(outStr);
        sc.close();
    }
}
