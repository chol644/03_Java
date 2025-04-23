package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage()); //예외발생 이유 출력
            //System.out.println(e.toString()); //예외발생 이유+예외종류
            //e.printStackTrace(); //예외발생 이유+예외종류+추적내용(위치)
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
    // printLength(null); 에서 문자열 대신 null 입력 시 NullPointerException 발생
    // 참조 변수가 null인 상태에서 필드나 메소드에 접근할 경우 발생

}
