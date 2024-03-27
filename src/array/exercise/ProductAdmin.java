package array.exercise;

import java.util.Scanner;

public class ProductAdmin {

    public static void main(String[] args) {
        // 상품 관리 프로그램
        /**
         * 상품 등록: 상품 이름과 가격을 입력 받음
         * 상품 목록: 지금까지 등록한 모든 상품의 목록 출력
         * ---
         * 1. 사용자 입력 받기
         *  1-1. 상품 등록 -> 사용자에게 "상품 이름", "가격"을 입력 받아 배열에 저장
         *  1-2. 상품 목록 -> 배열에 저장된 모든 상품의 정보를 출력(상품 이름: 가격)
         *  1-3. 종료
         * ! 상품은 3가지 까지 등록 가능
         */

        Scanner scanner = new Scanner(System.in);
        int userInput;

        String[] productNames = new String[3];
        int[] productPrices = new int[3];
        int productCount = 0;

        System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
        System.out.println("메뉴를 선택하세요: ");
        userInput = scanner.nextInt();

        for (int i = 0; i < 100; i++) { // 얼마나 반복해서 프로그램을 돌릴지는 일단 100으로 지정해놓음. 추후에 while문으로 하는 방법도 생각해보면 좋을듯
            if (userInput == 1) {
                if (productCount < 3) {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[i] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[i] = scanner.nextInt();

                    productCount++;
                } else {
                    System.out.println("현재 상품의 개수가 " + productCount + "개이므로 더 이상 상품을 등록할 수 없습니다.");
                }
            } else if (userInput == 2) {
                for (int j = 0; j < productCount; j++) { // 이 부분이 조금 이상한듯(상품 1번 등록하고 2번 누른 경우에는..?
                    System.out.println(productNames[j] + ": " + productPrices[j] + "원");
                }
            } else if (userInput == 3) {
                System.out.println("프로그램을 종료합니다.");
            }
        }

    }
}
