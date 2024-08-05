public class Forfun {

    public static int Calc(int base, int tiers) {
        if (tiers == 1) {
            return base;
        }
        return Calc(base * 3, tiers - 1);
    }

    public static void main(String[] args) {

        System.out.println(Calc(1640250, 13));
    }
}
