package array;

public class Array1 {

    public static void main(String[] args) {

        int[] students;         //배열 변수 선언
        students = new int[5];  //배열의 주소값(참조값)만 가지고 있는 students에 int형 배열 생성 후 주입
//        위 두 줄을 아래와 같이 쉽게 바꿀 수 있다.
//        -> int[] students2 = new int[]{1, 2, 3, 4, 5};
//        -> int[] students3 = {1, 2, 3, 4, 5}; (주로 사용하는 선언 방식)

        students[0] = 1;

        /**
         * java에서는 배열을 단순히 한 줄로 생성 하지 않고
         * 배열 변수 선언  /  배열 생성       으로 나뉜다.
         */
    }


}
