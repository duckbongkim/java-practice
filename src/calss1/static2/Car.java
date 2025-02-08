package calss1.static2;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println("차량 구입, 이름: "+name);
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("총 차량 판매: "+totalCars);
    }
}
