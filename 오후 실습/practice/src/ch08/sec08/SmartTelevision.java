package ch08.sec08;

public class SmartTelevision implements RemoteControl,Searchable {
    @Override
    public void turnOn() {
        System.out.println("TV 켤게");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끌게");
    }

    @Override
    public void search(String url) {
        System.out.println(url+" 검색할게");
    }
}
