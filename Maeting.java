import java.util.Scanner;
import java.util.Stack;

public class Maeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        int[] firstArr = new int[n]; 
        Stack<Integer> secondArr = new Stack<>(); 

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = sc.nextInt(); 
        }

        for (int i = 0; i < m; i++) {
            secondArr.add(sc.nextInt());
        }

        StringBuilder output = new StringBuilder(); 
        for (int i = 0; i < firstArr.length; i++) {
            if (secondArr.contains(firstArr[i])){
                output.append(firstArr[i] + " "); 
            }
        }
        System.out.println(output.substring(0, output.length()-1));
        sc.close();

    }
}
