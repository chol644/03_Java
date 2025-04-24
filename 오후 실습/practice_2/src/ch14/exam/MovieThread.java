package ch14.exam;

public class MovieThread extends Thread {
    @Override
    public void run() {
        try {
            // 1초 간격으로 "동영상을 재생합니다."를 3번 출력
            for (int i = 0; i < 3; i++) {
                System.out.println("동영상을 재생합니다.");
                Thread.sleep(1000);  // 1초(1000ms) 대기
            }
        } catch (InterruptedException e) {
            System.out.println("스레드가 인터럽트되었습니다.");
        }
    }

    public static void main(String[] args) {
        // MovieThread 객체 생성 후 실행
        MovieThread movieThread = new MovieThread();
        movieThread.start();  // 스레드 시작
    }
}
