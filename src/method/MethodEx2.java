package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("hello", 3);
        printMessage("hello1", 4);
        printMessage("hello2", 5);
    }
    public static void printMessage(String a, int b){
        for(int i = 0; i<b; i++){
            System.out.println(a);
        }
    }
}
