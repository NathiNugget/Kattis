import java.util.Scanner;

public class Vedurvindhradi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        sc.close();
        if (input >= 0 && input <= 0.2) {
            System.out.println("Logn");
        } else if (input >= 0.3 && input <= 1.5) {
            System.out.println("Andvari");
        } else if (input >= 1.6 && input <= 3.3) {
            System.out.println("Kul");
        } else if (input >= 3.4 && input <= 5.4) {
            System.out.println("Gola");
        } else if (input >= 5.5 && input <= 7.9) {
            System.out.println("Stinningsgola");
        } else if (input >= 8.0 && input <= 10.7) {
            System.out.println("Kaldi");
        } else if (input >= 10.8 && input <= 13.8) {
            System.out.println("Stinningskaldi");
        } else if (input >= 13.9 && input <= 17.1) {
            System.out.println("Allhvass vindur");
        } else if (input >= 17.2 && input <= 20.7) {
            System.out.println("Hvassvidri");
        } else if (input >= 20.8 && input <= 24.4) {
            System.out.println("Stormur");
        } else if (input >= 24.5 && input <= 28.4) {
            System.out.println("Rok");
        } else if (input >= 28.5 && input <= 32.6) {
            System.out.println("Ofsavedur");
        } else {
            System.out.println("Farvidri");
        }

    }
}
