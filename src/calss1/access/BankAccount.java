package calss1.access;

public class BankAccount {
    private int balance = 10000;

    public void deposit(int amount){
        System.out.println(amount+"원 입금");
        balance += amount;
        System.out.println();
    }

    public void withdraw(int amount){
        System.out.println(amount+"원 출금");
        if(amount<=balance){
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    public void getBalance(){
        System.out.println("현재 잔액: "+balance);
    }
}
