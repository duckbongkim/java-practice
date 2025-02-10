package calss1.static2;
import calss1.static2.Car.*;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("아반떼");
        Car car2 = new Car("코란도");
        Car car3 = new Car("무쏘");
        Car car4 = new Car("모하비");

        Car.showTotalCars();
        
    }
}
