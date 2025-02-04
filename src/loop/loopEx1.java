package loop;

public class loopEx1 {
    public static void main(String[] args){
        System.out.println("while");
        int a = 1;
        while (a<=10) {
            System.out.println(a);
            ++a;
        }
        System.out.println("--------------------");
        System.out.println("for");
        for(int count = 1; count<=10; ++count){
            System.out.println(count);
        }
    }
}
