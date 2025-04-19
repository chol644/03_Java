package ch06.advanced;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Input {
    // Scanner 객체에 대한 정적 참조 변수
    public static final Scanner scanner = new Scanner(System.in);

    public static String read(String title) {
        System.out.println(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.println(title + "(" + defaultValue + "): ");
        String input = scanner.nextLine();
        if (input.trim().equals("")) {
            return defaultValue;
        }
        return input;
    }

    public static int readInt(String title) {
        System.out.println(title);
        return scanner.nextInt();
    }

    public static boolean confirm(String title, boolean defaultValue) {
        System.out.println(title);
        if(scanner.nextLine() == "") {
            return defaultValue;
        }
        if (defaultValue) {
            return true;
        } else return false;
    }

    public static boolean confirm(String title) {
        return confirm(title, false);
    }

}
