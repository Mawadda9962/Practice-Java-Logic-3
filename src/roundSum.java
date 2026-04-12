public class roundSum {
    public static void main(String[] args){
        System.out.println(roundSum(16, 17, 18));
    }

    public static int roundSum(int a, int b, int c){
     return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num){
        int lastDigit = num % 10;

        if (lastDigit >= 5){
            return num + (10 - lastDigit);
        }else{
            return num - lastDigit;
        }

    }
}
