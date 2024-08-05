import java.util.Scanner;

public class Hangingout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int totalPeople = 0;
        int currentlyOperating = 0;
        int notAllowedGroups = 0;
        String[] input = new String[2];
        int groups = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < groups; i++) {
            input = sc.nextLine().split(" ");
            currentlyOperating = Integer.parseInt(input[1]);
            switch (input[0]) {
                case "enter":
                    if (totalPeople + currentlyOperating > lim) {
                        notAllowedGroups++;
                        break;
                    }
                    totalPeople += currentlyOperating;
                    break;
                case "leave":
                    totalPeople -= currentlyOperating;
                    break;
                default:
                    break;
            }
        }
        sc.close();
        System.out.println(notAllowedGroups);
    }
}
