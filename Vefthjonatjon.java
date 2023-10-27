import java.util.Scanner;

public class Vefthjonatjon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int CPU = 0; 
        int RAM = 0; 
        int HDD = 0; 
        for (int i = 0; i < N; i++) {
            String cpu = sc.next(); 
            String ram = sc.next(); 
            String hdd = sc.next(); 

            if (cpu.equals("J")){
                CPU++; 
            }
            if (ram.equals("J")){
                RAM++; 
            }
            if (hdd.equals("J")) {
                HDD++;
            }
        }

        System.out.println(Math.min(CPU, Math.min(RAM, HDD)));

        sc.close();
    }
}
