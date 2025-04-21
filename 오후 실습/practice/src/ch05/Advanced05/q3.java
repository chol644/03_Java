package ch05.Advanced05;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount =0;
        boolean process = true;
        int total = 0;

        while (process) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.println("선택 : ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")){
                amount = scanner.nextInt();
                scanner.nextLine();
                total+=amount;
                System.out.println("예금액 > "+total);
            } else if (strNum.equals("2")) {
                amount = scanner.nextInt();
                scanner.nextLine();
                total-=amount;
                System.out.println("예금액 > "+total);
            } else if (strNum.equals("3")) {
                System.out.println("잔고 > " + total);
            } else if (strNum.equals("4")) {
                process = false;
            }
            else {
                System.out.println("test");
            }
        }System.out.println("프로그램 종료");
    }
}
