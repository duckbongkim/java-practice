package scanner;
import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("상품의 가격을 입력하세요(0을 입력하면 종료): ");
            int price = scanner.nextInt();
            if(price == 0){
                System.out.println("종료...");
                break;
            }

            System.out.print("상품의 수량을 입력하세요: ");
            int count = scanner.nextInt();

            int sum = price * count;

            System.out.println("가격"+price+"갯수"+count+"총가격"+sum);
        }
        scanner.close();
    }
}
