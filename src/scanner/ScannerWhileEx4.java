package scanner;
import java.util.Scanner;
public class ScannerWhileEx4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while(true){
            System.out.print("1: 상품 구매, 2: 결제, 3: 종료 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                System.out.print("상품이름 임렵: ");
                String name = scanner.nextLine();

                System.out.print("상품 가격입력: ");
                int price = scanner.nextInt();

                System.out.print("상품 수량 입력: ");
                int cnt = scanner.nextInt();

                totalPrice = cnt*price;
                System.out.println("상품 이름"+name+"총가격: "+totalPrice);
            } else if (option == 2) {
                System.out.println("총비용: "+totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("종료합니다.");
                break;
            }else{
                System.out.println("다시 선택해주세요");
            }
        }
        scanner.close();

    }
}
