package array;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력을 숫자의 개수를 입력하세요: ");
        int a = scanner.nextInt();
        int[] numbers = new int[a];

        System.out.print(a+ "개의 숫자를 입력하세요.");
        for (int i = 0; i<a; i++){
            numbers[i] = scanner.nextInt();
        }
        int maxNum = numbers[0];
        int minNum = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>maxNum){
                maxNum = numbers[i];
            }
            if(numbers[i]<minNum){
                minNum = numbers[i];
            }
        }
        System.out.println("최고"+maxNum+"최소"+minNum);
    }
}
