package ch07.sec07.exam02;


public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3();
    }
    // 부모 타입으로 자동 타입 변환된 후에는 부모 클래스에 선언된 필드와 메소드만 접근 가능
    //변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정됨
}
