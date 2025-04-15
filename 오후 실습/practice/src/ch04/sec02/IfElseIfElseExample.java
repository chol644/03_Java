package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score =75;

        if(score >= 90) {
            System.out.println("점수: 90~100");
            System.out.println("등급: A입니다.");
        } else if(score >= 80) {
            System.out.println("점수: 80~89");
            System.out.println("등급: B입니다.");
        }else if(score >= 70) {
            System.out.println("점수: 70~79");
            System.out.println("등급: C입니다.");
        }else {
            System.out.println("점수: 0~69");
            System.out.println("등급: D입니다.");
        }
    }
}
