package ch06.advanced;

class Database {
    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Database singleton = new Database();

    // private 접근 권한을 갖는 생성자 선언
    private Database() {}

    // public 접근 권한을 갖는 정적 메소드 선언
    public static Database getInstance(){
        return singleton;
    }

    private String connection = "MySQL";

    public String connect() {
        System.out.println(connection + "에연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을닫습니다.");
    }
}
