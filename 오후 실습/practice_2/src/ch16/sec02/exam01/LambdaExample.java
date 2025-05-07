package ch16.sec02.exam01;

import org.w3c.dom.ls.LSOutput;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근");
            System.out.println("프로그래밍");
        });

        person.action(() -> System.out.println("퇴근"));
    }
}
