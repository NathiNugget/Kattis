import java.util.Scanner;

public class Airfaregrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int flights = sc.nextInt(); 
        int reimbursementLimit = sc.nextInt()/2; 
        int cheapestFlightToBuy = reimbursementLimit*2; 
        if (flights > 1){
            int nextNum = 0; 
            for (int i = 1; i < flights; i++) {
                nextNum = sc.nextInt()/2; 
                if (nextNum > reimbursementLimit){
                    reimbursementLimit = nextNum; 
                }
                else if (nextNum*2 < cheapestFlightToBuy){
                    cheapestFlightToBuy = nextNum*2; 
                }
            }
            if (cheapestFlightToBuy-reimbursementLimit >= 0){
                System.out.println(cheapestFlightToBuy-reimbursementLimit);
            }
            else System.out.println(0);
            

        } else {
            System.out.println(reimbursementLimit);
        }
        
        sc.close();
    }
}
