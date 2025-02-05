package array;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("행을 입력하세요:");
        int row = scanner.nextInt();
        System.out.print("열을 입력하세요:");
        int col = scanner.nextInt();
        int[][] numbers = new int[row][col];

        System.out.println(row*col + "개의 정수를 입력하세요:");
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                numbers[i][j] = scanner.nextInt();
            }

        }
        int max = numbers[0][0];
        int min = numbers[0][0];
        for(int number[] : numbers){
            for(int numberB : number){
                if(max < numberB){
                    max = numberB;
                }
                if(min > numberB){
                    min = numberB;
                }
            }
        }
        System.out.println("최댓값은 " + max + " 최솟값은 " + min);
    }
}
