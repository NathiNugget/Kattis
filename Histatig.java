import java.util.Scanner;

public class Histatig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        long[] intArr = new long[num]; 
        long max = 0; 
        long min = 0; 
        for (int i = 0; i < num; i++) {
            intArr[i] = sc.nextLong(); 
        }

        for (long i : intArr) {
            if (intArr.length != 1){
                if (i > max) max = i; 
                else if (i < min) min = i; 
            }
            else {
                max = i; 
                min = i; 
            }
            
        }
        sc.close();

        System.out.println(max + " " + min);
    }
}
