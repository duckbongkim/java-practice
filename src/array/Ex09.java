package array;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("행의 갯수를 입력하세요: ");
        int row = scanner.nextInt();

        System.out.print("열의 갯수를 입력하세요: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        System.out.println(row*col+"만큼 정수를 입력하세요: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("찾을 숫자를 입력하세요: ");
        int target = scanner.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == target){
                    System.out.println(target+"은"+(i+1)+"행"+(j+1)+"열에 있습니다.");
                    break;
                }
                if(arr[i][j] != target){
                    System.out.println("숫자가 없습니다.");
                    break;
                }
                }
            }
        }




    }

