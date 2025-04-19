package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        int n =0;

        do {
            n= (int)(Math.random()*6+1);
            System.out.println(n);
        } while (n<6);
    }
}
