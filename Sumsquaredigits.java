import java.util.Scanner;

public class Sumsquaredigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    int lim = sc.nextInt(); 
    while(n++ < lim){
      int N = sc.nextInt();
      int B = sc.nextInt();
      char[] dts = Long.toString(sc.nextLong(), B).toCharArray();
      int res = 0;

      for(char d : dts){
          int v = Integer.parseInt(Character.toString(d), B);
          res += v * v;
      }

      System.out.println(N + " " + res);
    }

    sc.close();
  }
}