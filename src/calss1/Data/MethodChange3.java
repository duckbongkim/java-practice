package calss1.Data;

public class MethodChange3 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = "+dataA.value);
        changeReferenceNew(dataA);
        System.out.println("매서드 호출 후: dataA.value = "+dataA.value);

    }
    static void changeReferenceNew(Data dataX){
        dataX = new Data();
        dataX.value = 20;
    }
}
