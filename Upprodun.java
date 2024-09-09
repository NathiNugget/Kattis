import java.util.Scanner;

public class Upprodun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int totalSpotsTaken = 0; 
        sc.close();
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < N; i++) {
            sb.setLength(0);
            int spotsToTake = (int) Math.ceil((double)M/N); 
            if (totalSpotsTaken + spotsToTake < M){
                for (int j = 0; j < spotsToTake; j++) {
                    sb.append("*"); 
                }
                totalSpotsTaken += spotsToTake; 
            } else {
                for (int j = 0; j < spotsToTake-1; j++) {
                    sb.append("*"); 
                }
                totalSpotsTaken += spotsToTake-1; 
            }
            System.out.println(sb.toString());
        }
    }
}
