import java.util.Scanner;

public class Estimatingtheareaofacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        while (!input.equals("")) {
            double r = Double.parseDouble(inputArr[0]);
            double m = Double.parseDouble(inputArr[1]);
            double c = Double.parseDouble(inputArr[2]);
            if (r == 0.0 && m == 0.0 && c == 0.0) {
                break;
            }
            System.out.println(Math.PI * Math.pow(r, 2) + " " + Math.pow(r * 2, 2) * (c / m));
            inputArr = sc.nextLine().split(" ");
        }
        sc.close();
    }
}
