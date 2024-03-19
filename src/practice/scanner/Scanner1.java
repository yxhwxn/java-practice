package practice.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();    //입력을 String으로 가져옴
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수 입력: ");
        int intValue = scanner.nextInt();   //입력은 int로 가져옴
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수 입력: ");
        double doubleValue = scanner.nextDouble();   //입력은 double로 가져옴
        System.out.println("입력한 실수: " + doubleValue);
    }
}
