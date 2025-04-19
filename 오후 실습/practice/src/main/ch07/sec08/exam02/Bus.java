package ch07.sec08.exam02;

public class Bus extends Vehicle {
    //메소드재정의(오버라이딩)
    @Override
    public void run() {
        System.out.println("버스가달립니다.");
    }
}