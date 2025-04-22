package ch09.sec02.exam02;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        a.useB();
    }
    // 실행 결과
    // B-생성자 실행
    // 1
    // B-method1 실행
    // 2
    // B-method2 실행
}
