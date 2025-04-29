package ch13.sec02.exam02;

public class HomeAgency  implements Rentable<Home> { // 타입파라미터P를Home으로대체
    @Override
    public Home rent() { // 리턴타입이반드시Home이어야함
        return new Home();
    }
}