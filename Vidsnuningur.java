import java.util.Scanner;

public class Vidsnuningur{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    char[] charArr = sc.nextLine().toCharArray();
    sc.close();
    StringBuilder sb = new StringBuilder(); 
    sb.append(charArr); 
    sb.reverse(); 
    System.out.println(sb);
} 
    
}
