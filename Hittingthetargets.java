import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hittingthetargets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        HashSet<ArrayList<Integer>> targets = new HashSet<>();
        ArrayList<Integer> coords;
        for (int i = 0; i < cases; i++) {
            String input = sc.next();
            coords = new ArrayList<>();
            switch (input) {
                case "rectangle":
                    coords.add(sc.nextInt());
                    coords.add(sc.nextInt());
                    coords.add(sc.nextInt());
                    coords.add(sc.nextInt());
                    targets.add(coords);
                    sc.nextLine();
                    break;
                case "circle":
                    coords.add(sc.nextInt());
                    coords.add(sc.nextInt());
                    coords.add(sc.nextInt()); 
                    targets.add(coords);
                    sc.nextLine();
                default:
                    break;
            }
        }
        int shots = sc.nextInt();
        int x = 0;
        int y = 0;
        int score = 0;
        for (int i = 0; i < shots; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            score = 0;
            for (ArrayList<Integer> arrayList : targets) {
                switch (arrayList.size()) {
                    case 3:
                        // THIS IS A CIRLCE
                        if (isWithinCircle(x, y, arrayList.get(0), arrayList.get(1), arrayList.get(2)))
                            score++;
                        break;
                    case 4:
                        // THIS IS A RECTANGLE
                        if (isWithinRectangle(x, y, arrayList.get(0), arrayList.get(1), arrayList.get(2),
                                arrayList.get(3))) {
                            score++;
                        }
                        break;
                    default:
                        break;
                }
            }
            System.out.println(score);
        }

        sc.close();
    }

    private static boolean isWithinRectangle(int x, int y, int x1, int y1, int x2, int y2) {
        return (x >= x1 && x <= x2 && y >= y1 && y <= y2);

    }

    public static boolean isWithinCircle(int x, int y, int circ_x, int circ_y, int radius) {
        return Math.sqrt(Math.pow(x - circ_x, 2) + Math.pow(y - circ_y, 2)) <= radius;
    }
}
