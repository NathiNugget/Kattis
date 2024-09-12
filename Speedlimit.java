import java.util.Scanner;

public class Speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        for (int i = 0; i < 10; i++) {
            int speeds = sc.nextInt(); 
            if (speeds == -1){
                break; 
            }
            else { 
                int previousHour = 0; 
                int milesDriven = 0; 
                for (int j = 0; j < speeds; j++) {
                    int velocity = sc.nextInt(); 
                    int newTime = sc.nextInt(); 
                    milesDriven += velocity * (newTime - previousHour); 
                    previousHour = newTime; 
                }
                System.out.println(milesDriven + " miles");
            }
        }
        sc.close();
    }
}
