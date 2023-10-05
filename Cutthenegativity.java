import java.util.ArrayList;
import java.util.Scanner;

public class Cutthenegativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cities = sc.nextInt();  
        
        int total_flights = 0; 
        int[][] inputArr = new int[cities][cities]; 
        ArrayList<int[]> outList = new ArrayList<>(); 
        
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < inputArr.length; j++) {
                inputArr[i][j] = sc.nextInt(); 
                if (inputArr[i][j] != -1) {
                    total_flights++;
                    int[] toAdd = {i+1, j+1, inputArr[i][j]};
                    outList.add(toAdd);  
                }
            }
        }
        System.out.println(total_flights);
        for (int i = 0; i < total_flights; i++) {
            System.out.println(outList.get(i)[0] + " " + outList.get(i)[1] + " " + outList.get(i)[2]);
        }
        sc.close();
    }
}