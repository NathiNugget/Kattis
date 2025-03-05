import java.util.Scanner;

public class Ethanol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] painting = new String[10];
        painting[0] = "  H  \n  |  \nH-C-OH\n  |  \n  H  ";
        painting[1] = "  H H  \n  | |  \nH-C-C-OH\n  | |  \n  H H  ";
        painting[2] = "  H H H  \n  | | |  \nH-C-C-C-OH\n  | | |  \n  H H H  ";
        painting[3] = "  H H H H  \n  | | | |  \nH-C-C-C-C-OH\n  | | | |  \n  H H H H  ";
        painting[4] = "  H H H H H  \n  | | | | |  \nH-C-C-C-C-C-OH\n  | | | | |  \n  H H H H H  ";
        painting[5] = "  H H H H H H  \n  | | | | | |  \nH-C-C-C-C-C-C-OH\n  | | | | | |  \n  H H H H H H  ";
        painting[6] = "  H H H H H H H  \n  | | | | | | |  \nH-C-C-C-C-C-C-C-OH\n  | | | | | | |  \n  H H H H H H H  ";
        painting[7] = "  H H H H H H H H  \n  | | | | | | | |  \nH-C-C-C-C-C-C-C-C-OH\n  | | | | | | | |  \n  H H H H H H H H  ";
        painting[8] = "  H H H H H H H H H  \n  | | | | | | | | |  \nH-C-C-C-C-C-C-C-C-C-OH\n  | | | | | | | | |  \n  H H H H H H H H H  ";
        painting[9] = "  H H H H H H H H H H  \n  | | | | | | | | | |  \nH-C-C-C-C-C-C-C-C-C-C-OH\n  | | | | | | | | | |  \n  H H H H H H H H H H  ";
        System.out.println(painting[sc.nextInt()-1]);
        sc.close();
    }
}
