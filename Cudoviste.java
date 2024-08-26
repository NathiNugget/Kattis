import java.util.Scanner;

public class Cudoviste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        char[][] layout = new char[R][C];
        for (int i = 0; i < R; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < C; j++) {
                layout[i][j] = line[j];
            }
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            System.out.println(spots(layout, i));
        }
    }

    public static int spots(char[][] layout, int carsToSquash) {
        int spotsAvailable = 0;
        switch (carsToSquash) {
            case 0:
                for (int i = 0; i < layout.length; i++) {
                    for (int j = 0; j < layout[0].length; j++) {
                        if (j < layout[0].length - 1 && i < layout.length - 1) {
                            if (layout[i][j] == '.' && layout[i][j + 1] == '.' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            }
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < layout.length; i++) {
                    for (int j = 0; j < layout[0].length; j++) {
                        if (j < layout[0].length - 1 && i < layout.length - 1) {
                            if (layout[i][j] == 'X' && layout[i][j + 1] == '.' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == 'X' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == '.' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == '.' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            }
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < layout.length; i++) {
                    for (int j = 0; j < layout[0].length; j++) {
                        if (j < layout[0].length - 1 && i < layout.length - 1) {
                            if (layout[i][j] == 'X' && layout[i][j + 1] == 'X' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == 'X' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == '.' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            } else if (layout[i][j] == 'X' && layout[i][j + 1] == '.' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == 'X' && layout[i][j + 1] == '.' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == 'X' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            }
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < layout.length; i++) {
                    for (int j = 0; j < layout[0].length; j++) {
                        if (j < layout[0].length - 1 && i < layout.length - 1) {
                            if (layout[i][j] == 'X' && layout[i][j + 1] == 'X' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == '.') {
                                spotsAvailable++;
                            } else if (layout[i][j] == '.' && layout[i][j + 1] == 'X' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            } else if (layout[i][j] == 'X' && layout[i][j + 1] == '.' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            } else if (layout[i][j] == 'X' && layout[i][j + 1] == 'X' && layout[i + 1][j] == '.'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            }
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < layout.length; i++) {
                    for (int j = 0; j < layout[0].length; j++) {
                        if (j < layout[0].length - 1 && i < layout.length - 1) {

                            if (layout[i][j] == 'X' && layout[i][j + 1] == 'X' && layout[i + 1][j] == 'X'
                                    && layout[i + 1][j + 1] == 'X') {
                                spotsAvailable++;
                            }

                        }

                    }
                }
                break;
            default:
                break;
        }
        return spotsAvailable;

    }
}
