import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] stringArr = sc.nextLine().split("-"); 
        sc.close();
        String output = ""; 
        for (int i = 0; i < stringArr.length; i++) {
            output += stringArr[i].substring(0, 1);
        }
        System.out.println(output);
        
    }
}
