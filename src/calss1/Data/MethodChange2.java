package calss1.Data;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("매서드 호출 전: data.value = "+data.value);
        changeReference(data);
        System.out.println("메서드 호출 후: data.value = "+data.value);

    }
    static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
