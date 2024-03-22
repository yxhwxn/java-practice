package array.exercise;

import java.util.Scanner;

public class ArrayEx3 {
    // 배열의 역순 출력
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력: ");

        for (int i = 0; i < 5; i++) {
            arr[4 - i] = userInput.nextInt();
        }

        System.out.println("입력한 정수 역순으로 출력: ");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
    }
}
