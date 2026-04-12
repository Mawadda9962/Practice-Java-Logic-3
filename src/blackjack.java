public class blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));

    }

    public static int blackjack(int a, int b) {
        if (a > 0 && b > 0) {
            if (a >= 21) {
                return a;
            }
            if (b >= 21) {
                return b;
            }
        }
        return Math.max(a, b);

    }

}