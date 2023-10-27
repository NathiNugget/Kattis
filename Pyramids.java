import java.util.Scanner;

public class Pyramids {
    static boolean canContinue = true;
    static int layer = 0; 
    
    public static int nextLayer(int side, int buildingBlocks){
        int layerNeeded = (int) Math.pow(side, 2); 
        if (layerNeeded <= buildingBlocks){ 
            layer++;
            return buildingBlocks - layerNeeded; 
        }
        canContinue = false; 
        return 0; 
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int buildingBlocks = sc.nextInt(); 
        sc.close();
        int side = 1; 
        while (canContinue && buildingBlocks > 0){
            buildingBlocks = nextLayer(side, buildingBlocks); 
            side += 2; 
        }
        System.out.println(layer);

    }
}
