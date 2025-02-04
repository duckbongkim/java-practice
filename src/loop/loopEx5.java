package loop;

public class loopEx5 {
    public static void main(String[] args){
        int rows = 10;
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a<=rows; a++){
            for(int b=0; b<=rows-a; b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
