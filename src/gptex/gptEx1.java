package gptex;
import java.util.Scanner;
public class gptEx1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalMoney = 0;

        while(true){
            System.out.print("1: 입금, 2: 출금, 3: 잔액 조회, 4:종료 : ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                System.out.print("입금할 금액을 입력하세요: ");
                int input = scanner.nextInt();

                if(input > 0){
                    totalMoney += input;
                    System.out.println(input + "원이 입금되었습니다.");
                }else{
                    System.out.println("0원이상 입력하세요");
                }
            } else if (option == 2) {
                System.out.print("출금할 금액을 입력하세요: ");
                int out = scanner.nextInt();
                if(out > 0){
                    if (out<=totalMoney) {
                        totalMoney -= out;
                        System.out.println(out + "원이 출금되었습니다." + " 잔액" + totalMoney);
                    }
                }else{
                    System.out.println("올바은 금액은 입력하세요");
                }

                }else if(option == 3) {
                System.out.println("잔액"+totalMoney);
            } else if (option == 4) {
                System.out.print("종료..");
                break;
            }else{
                System.out.println("올바른 옵션은 선택해주세요.");
            }

        }
        scanner.close();
        }
    }

