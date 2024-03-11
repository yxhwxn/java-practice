package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위 증감 연산자
        int a = 1;
        int b = 0;
        b = ++a;    // a가 2로 증가된 상태에서 b에 저장됨
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자
        a = 1;
        b = 0;
        b = a++;    // a가 1인 값을 b에 대입한 후, -> a를 2로 증가시킴
        System.out.println("a = " + a + ", b = " + b);
    }
}
