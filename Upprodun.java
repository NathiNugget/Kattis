import java.util.Scanner;

public class Upprodun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt(); 
        int teams = sc.nextInt(); 
        sc.nextLine(); 
        int remainder = teams%rooms; 
        if (remainder == 0){
            for (int i = 0; i < rooms; i++) {
                System.out.println("*".repeat(teams/rooms));
            }
        }
        else {
            int atypicalRooms = teams%rooms; 
            int normalRooms = rooms - atypicalRooms; 
            int numberOfStars = (int) Math.floor(teams/rooms); 
            for (int i = 0; i < atypicalRooms; i++) {
                System.out.println("*".repeat(numberOfStars+1));
            }
            for (int i = 0; i < normalRooms; i++) {
                System.out.println("*".repeat(numberOfStars));
            }
        }

       

        sc.close();
    }
}
