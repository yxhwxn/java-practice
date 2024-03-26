package array.exercise;

import java.util.Scanner;

public class ArrayEx7 {
    // 2차원 배열을 활용한 총점과 평균을 계산하는 프로그램

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] score = new int[4][3];
        int[] totalScore = new int[4];
        String[] printString = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(printString[j] + " 점수: ");
                score[i][j] = userInput.nextInt();

                totalScore[i] += score[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            double avg = (double) totalScore[i] / 3;
            System.out.println((i + 1) + "번의 총점: " + totalScore[i] + ", 평균: " + avg);
        }
    }
}
