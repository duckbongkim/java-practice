package scanner;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름!: ");
        String name = scanner.nextLine();

        System.out.print("수량!: ");
        int count = scanner.nextInt();

        System.out.print("가격!: ");
        int price = scanner.nextInt();

        int sum = count * price;

        System.out.println(name+"을"+count+"개를 주문 하셧습니다. "+"총 가격은"+sum+"원 입니다.");

        scanner.close();
    }
}
