package ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        try {
            // 0.5초 간격으로 "음악을 재생합니다."를 6번 출력
            for (int i = 0; i < 6; i++) {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(500);  // 0.5초(500ms) 대기
            }
        } catch (InterruptedException e) {
            System.out.println("스레드가 인터럽트되었습니다.");
        }
    }

    public static void main(String[] args) {
        // MusicRunnable 객체 생성
        MusicRunnable musicRunnable = new MusicRunnable();

        // 해당 Runnable을 실행할 스레드 객체 생성
        Thread musicThread = new Thread(musicRunnable);

        // 스레드 시작
        musicThread.start();
    }
}
