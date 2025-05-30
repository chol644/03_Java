package ch16.exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Consumer 계열 : 매개변수O, 반환형X
        // - 매개변수를 소비

        Consumer<String> printString = new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        };
        printString.accept("람다식 변경 전");

        // 람다식으로 변경
        Consumer<String> printString2 = (String s) -> {System.out.println("s = " + s);
        };

        printString2.accept("람다식으로 변경 성공");

        // BiConsumer<T,U> : 매개변수 T, U 두개 소비
        BiConsumer<String, Integer> printNameAge = (s, age) -> System.out.println("s = " + s + " age = " + age);

        printNameAge.accept("길동이",25);

    }
}
