package array;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i = size;
        for(int num : arr){
            num = i;
            System.out.print(num);
            if(num != 1){
                System.out.print(",");
            }
            i--;
        }
    }
}
