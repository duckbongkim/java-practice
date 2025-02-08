package calss1.Data;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        changeDate(data);
        System.out.println("data.value = "+data.value);

    }
    public static void changeDate(Data d){
        d.value = 20;
    }
}
