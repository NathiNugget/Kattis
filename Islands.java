import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Islands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        boolean[][] checked = new boolean[rows][cols];

        String line = "";
        for (int i = 0; i < rows; i++) {
            line = sc.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 0; j < cols; j++) {
                if (chars[j] == 'C' || chars[j] == 'L') {
                    checked[i][j] = true;
                }
            }
        }

        sc.close();

        int min_islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (checked[i][j]) {

                    checked = dfs(checked, i, j);
                    min_islands++;
                }
            }
        }

        System.out.println(min_islands);

    }

    public static boolean[][] dfs(boolean[][] canCheck, int y, int x) {
        Stack<Node> stack = new Stack<>();
        ArrayList<Node> visited = new ArrayList<>();
        Node root = new Node(y, x);
        stack.push(root);
        visited.add(root);
        int lim_x = canCheck.length;
        int lim_y = canCheck[0].length;
        while (!stack.isEmpty()) {
            try {
                root = stack.pop();
                if (root.x == 0) {
                    if (root.y == 0 && root.y != lim_y) {
                        if (canCheck[root.y + 1][root.x]) {
                            root = new Node(y + 1, x);
                            visited.add(root);
                            stack.push(root);
                        }
                    } else if (root.y != 0) {
                        if (canCheck[root.y - 1][root.x]) {
                            Node checking = new Node(root.y - 1, root.x);
                            if (!visited.contains(checking)) {
                                root = checking;
                                visited.add(root);
                                stack.push(root);
                            }

                        }
                    }
                } else {
                    if (canCheck[root.y][root.x - 1]) {
                        Node checking = new Node(root.y, root.x - 1);

                        if (!visited.contains(checking)) {
                            root = checking;
                            visited.add(root);
                            stack.push(root);
                        }
                    }
                }

                if (canCheck[root.y][root.x + 1]) {
                    Node checking = new Node(y, x + 1);
                    if (!visited.contains(checking)) {
                        root = checking;
                        visited.add(root);
                        stack.push(root);
                    }

                }

                for (Node node : visited) {
                    canCheck[node.y][node.x] = false;
                }

            }

            catch (Exception e) {
                continue;
            }
        }

        for (Node n : visited) {
            canCheck[n.y][n.x] = false;
        }

        return canCheck;

    }
}
