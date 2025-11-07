import java.math.BigInteger;
import java.util.Scanner;

public class Lidaskipting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        BigInteger base = new BigInteger("3");

        System.out.println(num.mod(base) == BigInteger.ZERO ? "Jebb" : "Neibb");

        sc.close();

    }
}
