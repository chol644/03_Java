package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] words = board.split(",");

        //인덱스별로 읽기
        System.out.println("번호: " + words[0]);
        System.out.println("제목: " + words[1]);
        System.out.println("내용: " + words[2]);
        System.out.println("성명: " + words[3]);
        System.out.println();

        for (String word : words) {
            System.out.println(word);
        }

    }
}
