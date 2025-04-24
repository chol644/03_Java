package ch14.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
//@AllArgsConstructor
public class Player implements Runnable {
    private String name;
    //랜덤 객체 생성
    private final Random random = new Random();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
            int curr = Main.count;//현재 숫자를 지역변수에 복사
            // 1~2초 대기
            Thread.sleep(random.nextInt(5)*200 + 1000);

            // sleep 전후 숫자를 비교
            // -> 달라짐 -> 다른 player가 main.count를 증가시켰다.
            while(curr != Main.count){
                curr = Main.count;
                Thread.sleep(random.nextInt(5)*200 );
            }
            int callNumber = ++Main.count;
            System.out.printf("%-10s : %2d \n" , name , callNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
