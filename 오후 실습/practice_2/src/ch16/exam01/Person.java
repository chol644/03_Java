package ch16.exam01;

// 매개변수로 Workable 인터페이스를 구현한 객체를 전달 받음
public class Person {
    public void action(Workable workable) {
        workable.work();
    }
}
