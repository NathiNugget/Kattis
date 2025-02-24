import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int day = sc.nextInt(); 
        int month = sc.nextInt(); 
        
        LocalDate ld = LocalDate.of(2009, month, day); 
        String output = ld.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH); 

        System.out.println(output);
        
        sc.close();
    }
}
