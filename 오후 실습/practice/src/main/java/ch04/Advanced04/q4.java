package ch04.Advanced04;

public class q4 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j =1 ; j <= 10 ; j++){
                result = (4*i)+(5*j);
                if (result == 60){
                    System.out.println(i+","+j);
            }
            }
        }
    }
}
