import java.util.Scanner;

public class Skener {
    public static void printWarpedMatrix(String line, int length, int width){
        StringBuilder sb = new StringBuilder(); 
        for (char c : line.toCharArray()) {
            for (int i = 0; i < width; i++) {
                sb.append(c); 
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int R = sc.nextInt(); 
        int C = sc.nextInt(); 
        int ZR = sc.nextInt(); 
        int ZC = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < R; i++) {
            printWarpedMatrix(sc.nextLine(), ZR, ZC);
        }
        sc.close();
    }
}
