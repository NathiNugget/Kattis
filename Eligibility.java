import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cases = sc.nextInt(); 
        sc.nextLine(); 
        String[] stringArr = new String[4]; 
        for (int i = 0; i < cases; i++) {
            stringArr = sc.nextLine().split(" "); 
            
            String[] dateArr = stringArr[1].split("/"); 
            String[] bornArr = stringArr[2].split("/"); 
            if(dateArr[0].compareTo("2010") >= 0 || bornArr[0].compareTo("1991")>= 0){
                System.out.println(stringArr[0] + " eligible");
            }
            else if (Integer.parseInt(stringArr[3]) > 40){
                System.out.println(stringArr[0] + " ineligible");
            }
            else {
                System.out.println(stringArr[0] + " coach petitions");
            }
        }
        sc.close();
    }
}
