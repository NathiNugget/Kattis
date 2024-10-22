import java.util.ArrayList;
import java.util.Scanner;



public class Weakvertices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] graph;
        StringBuilder output = new StringBuilder(); 
        while (n != -1) {
            if (n != 1 || n != 0) {
                graph = new boolean[n][n];
                // REGISTER GRAPH VALUE INTO ARRAY
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int nextVertice = sc.nextInt();
                        if (nextVertice == 1) {
                            graph[i][j] = true;
                        }
                    }
                }
                // ADD VERTICES AND PATHS TO 
                for (int i = 0; i < graph.length; i++) {
                    ArrayList<Integer> neighbors = new ArrayList<>(); 
                    for (int j = 0; j < graph.length; j++) {
                        
                        if (graph[i][j]) {
                            neighbors.add(j);
                        } 
                    }
                    if (!IsStrong(graph, neighbors, i)){
                        output.append(i + " "); 
                    } 

                }
                
                graph = null; 
                System.out.println(output.toString().trim());
                output = new StringBuilder();
            } else {
                sc.nextInt(); 
                System.out.println(0);
            }
            n = sc.nextInt(); 
        }
        sc.close();
    }

    private static boolean IsStrong(boolean[][] graph, ArrayList<Integer> neighbors, int source) {
        // TODO Auto-generated method stub
        if (neighbors.size() == 1) return false;
        for (int i = 0; i < graph.length; i++) {
            if (neighbors.contains(i)){
                ArrayList<Integer> localNeighbors = new ArrayList<>(); 
                for (int j = 0; j < graph[i].length; j++) {
                    if (neighbors.contains(j) && j != source){
                        if (graph[i][j]) localNeighbors.add(j); 
                    }
                    else if (j == source) localNeighbors.add(j); 
                }
                if (localNeighbors.contains(source) && localNeighbors.size() > 1) return true; 
            }
        }

        
        return false; 

    }

    

}
