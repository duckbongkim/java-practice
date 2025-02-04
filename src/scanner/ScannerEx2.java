package scanner;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num1 = scanner.nextInt();


        if(num1 % 2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

        scanner.close();
    }
}
