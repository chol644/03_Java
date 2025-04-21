package ch05.Advanced05;

public class q2 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = 0;

        for (int item : array){
            if(item > max){
                max = item;
            }
        }
        System.out.println(max);
    }
}
