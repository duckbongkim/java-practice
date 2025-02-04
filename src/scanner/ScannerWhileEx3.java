package scanner;
import java.util.Scanner;
public class ScannerWhileEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input,sum=0,cnt=0;

        System.out.print("숫자를 입력하세요(-1입력시 종료): ");

        while((input = scanner.nextInt()) != -1){
            sum += input;
            cnt++;
        }

        double average;
        if(cnt > 0){
            average = (double) sum/cnt;
        }else {
            average = 0;
        }

        System.out.println("입력한 숫자들의 합계 "+ sum);
        System.out.println("입력한 숫자들의 평균 "+ average);

        scanner.close();
    }
}
