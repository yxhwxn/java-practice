package practice.scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자를 입력하세요: ");
            String inputString = scanner.nextLine();

            if (inputString.equals("exit")) {
                System.out.println("exit을 입력했습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("입력한 문자열: " + inputString);
            }
        }
    }
}
