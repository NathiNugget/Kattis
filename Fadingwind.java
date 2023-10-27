import java.util.Scanner;

public class Fadingwind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int h = sc.nextInt(); 
        int k = sc.nextInt();
        int v = sc.nextInt(); 
        int s = sc.nextInt(); 
        int total_dist = 0; 
        sc.close();
        while (h > 0){
            v += s; 
            v -= Math.max(1, Math.floor(v/10)); 
            if (v >= k){
                h++; 
            }
            if (0 < v && v < k){
                h--; 
                if (h == 0){
                    v = 0; 
                }
            }
            if (v <= 0){
                h = 0; 
                v = 0; 
            }
            if (s > 0){
                s--; 
            }
        total_dist += v; 
        }
        System.out.println(total_dist);
    }
}
