package ch07.advanced;

public class FileDownloadServlet extends HttpServlet {
    @Override
    public void service() {
        System.out.println("파일 다운로드합니다.");
    }
}
