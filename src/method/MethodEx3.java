package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = inMoney(balance, 2000);
        balance = outMoney(balance, 3000);
        System.out.println("잔액: "+balance);
    }
    public static int inMoney(int balance, int amount){
        balance += amount;
        System.out.println(amount+" 원을 입금함, "+"현재 잔액: "+balance+"원");
        return balance;
    }
    public  static int outMoney(int balance, int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount+" 원을 출금함, "+"현재 잔액: "+balance+"원");
        } else {
            System.out.println("잔액부족");
        }
        return balance;
    }
}
