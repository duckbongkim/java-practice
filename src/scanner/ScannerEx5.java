package scanner;
import java.util.Scanner;
public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1>num2){
            int temp = 0;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 정수:");
        for (int i = num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }

    }
}