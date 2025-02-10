package Ingeritance;

public class ElectricCar extends Car{

    @Override
    public void move(){
        System.out.println("차를 아주 빠르게 이동");
    }
    
    public void charge(){
        System.out.println("충전");
    }
}
