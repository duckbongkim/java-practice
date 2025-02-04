package scanner;
import java.util.Scanner;
public class ScannerWhileEx1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요(엄준식을 입력시 종료됨): ");
            String name = scanner.nextLine();

            if(name.equals("엄준식")){
                System.out.println("엄...");
                break;
            }

            System.out.print("당신의 나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("이름: "+name+", 나이: "+age);
        }
        scanner.close();
    }
}
