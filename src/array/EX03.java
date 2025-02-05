package array;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 최대 저장 개수 입력
        int maxProducts = 10;

        // 배열 생성
        String[][] productArray = new String[maxProducts][2];

        // 배열 행 순서 정하는 번호
        int cnt = 0;

        while (true) {
            System.out.println("----------상품 구매 프로그램------------");
            System.out.println("1: 상품입력  2: 상품목록  3: 프로그램 종료");
            //사용자 입력
            int selectNum = scanner.nextInt();

            //사용자 입력에 따른 조건 선택
            if (selectNum == 1){
                scanner.nextLine(); // 이전 입력된 줄바꿈 문자 제거용

                System.out.print("상품명을 입력하시오. : ");
                String productName = scanner.nextLine();

                System.out.print("가격을 입력하시오. : ");
                String productPrice = scanner.nextLine();


                productArray[cnt][0] = productName;
                productArray[cnt][1] = productPrice;
                cnt++;


            } else if (selectNum == 2) {
                for (int i = 0; i < cnt; i++){
                    System.out.print("상품명: "+ productArray[i][0] + " ");
                    System.out.print("가 격: "+productArray[i][1] + "원");
                    System.out.println();
                }
            } else if (selectNum == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 값을 입력하시오.");
            }

        }

    }
}
