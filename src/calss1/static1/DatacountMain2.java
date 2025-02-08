package calss1.static1;

public class DatacountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A counter = "+ counter.count);


        Data2 data2 = new Data2("A", counter);
        System.out.println("A counter = "+ counter.count);


        Data2 data3 = new Data2("A", counter);
        System.out.println("A counter = " +counter.count);
    }
}
