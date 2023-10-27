import java.util.Scanner;

public class Smil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char[] inputArr = sc.nextLine().toCharArray();
        sc.close();
        char old = 'x'; 
        char previous = 'x';
        int i = 0; 
        for (char c : inputArr) {
            if (("" + previous + c).equals(":)")){
                System.out.println(i-1);
            }
            else if (("" + previous + c).equals(";)")){
                System.out.println(i-1);
            }
            else if (("" + old + previous + c).equals(":-)")){
                System.out.println(i-2);
            }
            else if (("" + old + previous + c).equals(";-)")){
                System.out.println(i-2);
            }
            old = previous; 
            previous = c; 
            i++; 
        }

    }
}
