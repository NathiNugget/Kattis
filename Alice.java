import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    long num = sc.nextLong(); 
    if (num % 2 == 0){
        System.out.println("Bob");
    }
    else {
        System.out.println("Alice"); 
    }
     sc.close();
    }
}
