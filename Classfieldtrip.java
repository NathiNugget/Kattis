import java.util.Arrays;
import java.util.Scanner;

public class Classfieldtrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in1 = sc.nextLine(); 
        String in2 = sc.nextLine(); 
        sc.close();
        char[] input = new char[in2.length() + in2.length()]; 
        input = (in1+in2).toCharArray(); 
        Arrays.sort(input);
        System.out.println(input);
    }
}
