package array;

public class Array2 {

    public static void main(String[] args) {
        // 2차원 배열 선언, 0으로 자동 초기화
        int[][] arr = new int[2][3];


        // 한 번에 값을 넣어줘서 초기화 해줄 수도 있음
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(arr2[1][2]);

    }
}
