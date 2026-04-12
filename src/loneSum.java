public class loneSum {
    public static void main(String[] args){
        System.out.println(loneSum(2, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(1, 2, 3));
    }
    public static int loneSum(int a, int b, int c){
        int sum = 0;
        if(a != b){
            sum += a;
        }
        if(b != c){
            sum += b;
        }
        if(a != c){
            sum +=c;
        }
        return sum;
    }
}
