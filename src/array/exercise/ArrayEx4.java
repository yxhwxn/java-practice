package array.exercise;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("5개의 정수 입력: ");
        int[] arr = new int[5];
        int sum = 0;
        int cnt = 0;
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = userInput.nextInt();
            sum += arr[i];
            cnt++;
        }

        avg = (double) sum / cnt;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 합계: " + avg);
    }
}
