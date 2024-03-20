package array.exercise;

import java.util.Scanner;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 입력받은 값을 배열의 size하고, 배열에 다음과 같이 직접 값 입력하기
        // -> input: 2, 3 output: {1,2,3}, {4,5,6}

        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 정하시오: ");

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[row - 1].length; j++) {
                if (i == 0) {
                    arr[i][j] = j + 1;
                } else if (i == 1) {
                    arr[i][j] = (j + col) + 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[row - 1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
