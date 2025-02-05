package array;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("행의 갯수를 입력하세요: ");
        int row = scanner.nextInt();

        System.out.print("열의 객수를 입력하세요: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        System.out.println(row*col+"만큼 정수를 입력하세요.");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int even = 0;
        int odd = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] % 2 == 0){
                    even++;
                }else {
                    odd++;
                }
            }
        }
        System.out.println("짝수의 갯수: "+even);
        System.out.println("홀수의 갯수: "+odd);
    }
}
