package ch08.sec10.exam02;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달려요");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}
