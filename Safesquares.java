import java.util.Scanner;

public class Safesquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[8][8];
        int safe = 0;
        String input;
        for (int i = 0; i < 8; i++) {
            input = sc.nextLine();
            board[i] = input.toCharArray();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'R')
                    continue;
                if (board[i][j] == '.') {
                    if (board[i][0] == '.' &&
                            board[i][1] == '.' &&
                            board[i][2] == '.' &&
                            board[i][3] == '.' &&
                            board[i][4] == '.' &&
                            board[i][5] == '.' &&
                            board[i][6] == '.' &&
                            board[i][7] == '.' &&
                            board[0][j] == '.' &&
                            board[1][j] == '.' &&
                            board[2][j] == '.' &&
                            board[3][j] == '.' &&
                            board[4][j] == '.' &&
                            board[5][j] == '.' &&
                            board[6][j] == '.' &&
                            board[7][j] == '.') {
                        safe++;
                    }
                }
            }
        }
        System.out.println(safe);

        sc.close();

    }
}
