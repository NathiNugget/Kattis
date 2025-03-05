import java.util.Scanner;

public class Hairofthedog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int days = sc.nextInt(); 
        sc.nextLine(); 
        boolean drankYesterday = false; 
        int hungover = 0; 
        for (int i = 0; i < days; i++) {
            String today = sc.nextLine(); 
            if (drankYesterday){
                if (today.equals("drunk")){
                    continue; 
                }
                else {
                    drankYesterday = false; 
                    hungover++; 
                }
            }
            else {
                if (today.equals("drunk")){
                    drankYesterday = true; 
                }

            }
        }
        System.out.println(hungover);
        sc.close();
    }
}
