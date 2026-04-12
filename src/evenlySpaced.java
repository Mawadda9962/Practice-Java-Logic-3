public class evenlySpaced {
    public static void main (String[] args){
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));

    }
    public static boolean evenlySpaced(int a, int b, int c){
        int small;
        if (a <= b && a <= c) {
            small = a;
        } else if (b <= a && b <= c) {
            small = b;
        } else {
            small = c;
        }

        int large;
        if (a >= b && a >= c) {
            large = a;
        } else if (b >= a && b >= c) {
            large = b;
        } else {
            large = c;
        }

        int middle = a + b + c - small - large;
        return (middle - small) == (large - middle);
    }

}