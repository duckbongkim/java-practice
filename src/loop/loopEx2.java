package loop;

public class loopEx2 {
    public static void main(String[] args){
        int a = 1;
        int max = 10;
        int sum = 0;
        while(a <= max){
            sum += a;
            ++a;
        }
        System.out.println(sum);
        System.out.println("for");
        int sum2 = 0;
        for(int i = 1; i<=max; ++i){
            sum2 += i;
        }
        System.out.println(sum);
    }
}
