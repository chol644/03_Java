package ch06.advanced;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        String name1 = Input.read("이름: ");
        System.out.println("입력값: " + name1);

        String name2 = Input.read("이름", "홍길동");
        System.out.println("입력값: " + name2);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean exit1 = Input.confirm("종료할까요?(Y/n)", false);
        System.out.println("입력값: " + exit1);

        boolean exit2 = Input.confirm("종료할까요?(Y/n)", true);
        System.out.println("입력값: " + exit2);
    }
}
