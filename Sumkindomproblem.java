import java.util.Scanner;

public class Sumkindomproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int P = sc.nextInt(); 
        int[] numbers = new int[P]; 

        for (int i = 0; i < P; i++) {
            sc.nextInt(); 
            numbers[i] = sc.nextInt(); 
        }

        

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+1 + " " + (calculateSum(numbers[i]) + " " + calculateOddSum(numbers[i]) + " " + calculateEvenSum(numbers[i])));
        }

        sc.close();

        
    }

    public static long calculateEvenSum(int N){
        int idx = 1; 
        int currentNum = 2; 
        long sum = 0; 
        while (!(idx > N)){
            sum += currentNum; 
            currentNum += 2;
            idx++;  
        } 
        return sum; 
    }

    public static long calculateOddSum(int N){
        int idx = 1;
        int currentNum = 1; 
        long sum = 0;
        while (!(idx > N)){
            sum += currentNum; 
            currentNum += 2; 
            idx++;
        } 
        return sum; 
    }

    public static long calculateSum(int N){
        int currentNum = 1;
        int sum = 0; 
        while (!(currentNum > N)) {
             
            sum += currentNum; 
            currentNum++;
        }
        return sum; 
    }
}
