import java.util.Scanner;

public class Cetvrta {

    public static int outlier(int i, int j, int k){
        if (i == j) {
            return k; 
        }
        if (j == k)
            return i; 
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x1 = sc.nextInt(); int y1 = sc.nextInt(); int x2 = sc.nextInt(); int y2 = sc.nextInt(); int x3 = sc.nextInt(); int y3 = sc.nextInt(); 
        sc.close();
        System.out.println(outlier(x1, x2, x3) + " " + outlier(y1, y2, y3));
        
    }
}
