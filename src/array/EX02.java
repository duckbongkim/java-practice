package array;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기 지정 : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // 배열 값 입력
        for (int i = 0; i < size; i++){
            int num = scanner.nextInt();
            arr[i] = num;
        }

        // 최소 최대 값 구하기
        int minNum= arr[0];
        int maxNum= arr[0];

        for (int number : arr){
            if (number < minNum){
                minNum = number;
            }
            if (number > maxNum){
                maxNum = number;
            }
        }
        System.out.println("MinNum :" + minNum);
        System.out.println("MaxNum :" + maxNum);

    }
}
