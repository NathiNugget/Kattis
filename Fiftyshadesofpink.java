import java.util.Scanner;

public class Fiftyshadesofpink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0; 
        sc.nextLine(); 
        String input;
        for (int i = 0; i < n; i++) {
            input = sc.nextLine().toLowerCase(); 
            if (input.contains("rose") || input.contains("pink")) res++; 
        }
        System.out.println(res == 0 ? "I must watch Star Wars with my daughter" : res);
        sc.close();
    }
}
