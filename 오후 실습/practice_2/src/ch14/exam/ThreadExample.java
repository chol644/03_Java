package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // MovieThread 객체 생성 후 실행
        MovieThread movieThread = new MovieThread();
        movieThread.start();  // MovieThread 스레드 시작

        // MusicRunnable 객체 생성
        MusicRunnable musicRunnable = new MusicRunnable();

        // 해당 Runnable을 실행할 스레드 객체 생성
        Thread musicThread = new Thread(musicRunnable);

        // MusicRunnable 스레드 시작
        musicThread.start();
    }
}
