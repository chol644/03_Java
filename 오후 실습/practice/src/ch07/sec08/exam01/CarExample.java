package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car();

        //tire 객체
        myCar.tire=new Tire();
        myCar.run();

        //hankook
        myCar.tire=new HankookTire();
        myCar.run();

        //kumho
        myCar.tire=new KumhoTire();
        myCar.run();
    }
}
