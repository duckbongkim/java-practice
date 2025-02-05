package array;

public class Ex08 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int a = 1;
        for(int col=0; col<arr[0].length; col++){
            for(int row=0; row<arr.length; row++ ){
                arr[row][col] = a++;
            }
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
