import java.util.Scanner;

public class Upprodun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt(); 
        int TEAMS = sc.nextInt();
        sc.nextLine(); 
        int remainder = TEAMS%rooms;
        if (remainder == 0){
            for (int i = 0; i < rooms; i++) {
                System.out.println("*".repeat(TEAMS/rooms));
            }
        }
        else {
            int atypicalRooms = TEAMS%rooms;
            int normalRooms = rooms - atypicalRooms; 
            int numberOfStars = (int) Math.floor(TEAMS/rooms);
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
