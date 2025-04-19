package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램 종료는 q");
        String str ="";

        do {
            System.out.println("> ");
            str = scanner.nextLine();
            System.out.println(str);
        } while (!str.equals("q"));
        System.out.println("프로그램 종료");
    }
}
