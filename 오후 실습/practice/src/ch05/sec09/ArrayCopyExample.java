package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        int[] newStrArray = new int[5];

        //배열 항목 복사
        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        //배열 항목 출력
        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
