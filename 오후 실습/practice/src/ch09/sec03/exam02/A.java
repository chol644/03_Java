package ch09.sec03.exam02;

public class A {
    //정적멤버클래스
    static class B {
        //인스턴스필드
        int field1 = 1;
        static int field2 = 2;
        //생성자
        B() {
            System.out.println("B-생성자 실행");
        }

        //인스턴스메소드
        void method1() {
            System.out.println("B-method1 실행");
        }
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
}