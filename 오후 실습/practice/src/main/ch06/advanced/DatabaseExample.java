package ch06.advanced;

public class DatabaseExample {
    public static void main(String[] args) {
        Database obj = Database.getInstance();

        System.out.println("데이터베이스: " + obj.connect()); // 원하는 중간 출력
        obj.close(); // 닫기 메시지 출력
    }

}
