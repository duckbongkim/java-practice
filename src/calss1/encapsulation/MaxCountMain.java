package calss1.encapsulation;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCount count = new MaxCount(5);

        count.getCount();

        count.increment();
        count.increment();
        count.increment();
        count.increment();
        count.increment();
        count.increment();

        count.getCount();

    }
}
