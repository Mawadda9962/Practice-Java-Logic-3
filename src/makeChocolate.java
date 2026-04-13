public class makeChocolate {
    public static void main(String[] args){
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));

    }

    public static int makeChocolate(int small, int big, int goal){

        int maxBig = Math.min(big, goal/5);
        int remaining = goal - (maxBig * 5);
        if (remaining <= small){
            return remaining;
        }
        return -1;
    }
}
