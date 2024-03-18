package practice;

public class MowebPractice {

    public static void print_current_code(char code, int count) {
        // W or B 조합의 문자열이 올바르게 입력되지 않는 경우 에러 메시지 출력
        if (count == 0) {
            System.out.println("Encoding error!");
            System.exit(1);
        }

        switch (code) {
            case 'W':
                System.out.print(count + "W");
                break;
            case 'B':
                if (count == 1) {
                    System.out.print("B");
                } else {
                    System.out.print(count + "B");
                }
                break;
            default:
                System.out.println("Encoding error!");
                System.exit(1);
        }
    }

    public static void run_length_encoding(String screen) {
        char currentChar = screen.charAt(0);
        int count = 1;

        for (int i = 1; i < screen.length(); i++) {
            if (screen.charAt(i) == currentChar) {
                count++;
            } else {
                print_current_code(currentChar, count);
                currentChar = screen.charAt(i);
                count = 1;
            }
        }

        // 반복문의 조건에 포함되지 않는 마지막 문자 출력
        print_current_code(currentChar, count);
    }

    public static void main(String[] args) {
        String screen = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        System.out.println("Run-length encoding (RLE) Test");
        System.out.println("Input data: " + screen);
        System.out.print("Encoding result: ");
        run_length_encoding(screen);
    }
}
