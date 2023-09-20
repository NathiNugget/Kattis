import java.util.Scanner;

public class Detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();  
        for (int i = 0; i < lim; i++) {
            char[] first = sc.next().toCharArray(); 
            char[] second = sc.next().toCharArray(); 
            StringBuilder output = new StringBuilder(); 
            for (int j = 0; j < second.length; j++) {
                if (first[j] == second[j]) {
                    output.append('.'); 
                } else {
                    output.append('*'); 
                }
                
            }
            System.out.println(first);
            System.out.println(second);
            System.out.println(output);
            System.out.println();
        }

        sc.close();
    }
}
