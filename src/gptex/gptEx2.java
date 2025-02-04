package gptex;
import java.util.Scanner;
public class gptEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while(true){

            System.out.print("1: 덧셈, 2: 뺄셈, 3: 곱셈, 4: 나눗셈, 5: 종료: ");
            int option = scanner.nextInt();

            System.out.print("첫번쨰 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();


            
            if(option == 1){
                int sum = num1 + num2;
                System.out.println("두수의 합은 = "+sum);
            } else if (option == 2) {
                int minus = num1 - num2;
                System.out.println("두수의 빼기는 = "+minus);
            } else if (option == 3) {
                int multi = num1 * num2;
                System.out.println("두수의 곱은 = "+multi);
            } else if (option == 4) {
                if (num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                double div = (double) num1 / num2;
                System.out.println("두수의 나누기는 = "+div);
            } else if (option == 5) {
                System.out.println("종료..");
                break;
            }else {
                System.out.println("옵션을 다시 선택해주세요");
            }

        }
        scanner.close();
    }
}
