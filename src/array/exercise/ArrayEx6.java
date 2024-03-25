package array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    // 문제 - 가장 작은 수, 큰 수 찾기
    // 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로 그램

    public static void main(String[] args) {
        int inputCount;
        Scanner userInput = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수 입력: ");
        inputCount = userInput.nextInt();

        int[] intArr = new int[inputCount];

        System.out.println(inputCount + "개의 정수 입력: ");
        for (int i = 0; i < inputCount; i++) {
            intArr[i] = userInput.nextInt();
        }

        int minValue = Arrays.stream(intArr).min().getAsInt();
        int maxValue = Arrays.stream(intArr).max().getAsInt();

        System.out.println("최소값: " + minValue);
        System.out.println("최대값: " + maxValue);
    }
}
