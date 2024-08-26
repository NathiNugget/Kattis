
import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double x1 = sc.nextDouble(); 
        double y1 = sc.nextDouble(); 
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble(); 
        double side1 = 0.0; 
        if (x1 > x2){
            side1 = x1-x2; 
        } else side1 = x2-x1; 

        double side2 = 0.0; 
        if (y1 > y2){
            side2 = y1-y2; 
        } else side2 = y2-y1; 
        System.out.println(Math.abs(side2)*Math.abs(side1));
        sc.close();
        
        
    }
}