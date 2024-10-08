import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i = sc.nextInt(); 
        sc.close();
        int res = Calculate(i); 
        System.out.println(res);


    }

    public static int Calculate(int iterations)
    {
        return Recurseeee(iterations, 2);
    }

    private static int Recurseeee(int iterations, int total) {
        if (iterations == 0){
            return total*total;
        }
        return Recurseeee(iterations-1, total+=(total-1));
    }
}
