package loop;

public class loopEx4 {
    public static void main(String[] args){
        int rows = 5;
        for(int a=1; a<=rows; ++a){
            for(int b=1; b<=a; ++b){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=rows; i++){
            for(int j = i; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
