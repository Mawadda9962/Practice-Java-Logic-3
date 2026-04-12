public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
    }
public static boolean makeBricks(int small, int big, int goal){
        int max = goal / 5;
        if(big < max){
            max = big;
        }
        int remainig = goal - (max * 5);
        return remainig <= small;
           }
    }
