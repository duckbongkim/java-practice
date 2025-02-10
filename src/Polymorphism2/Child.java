package Polymorphism2;

public class Child extends Parent{
//    public void childMethod(){
//        System.out.println("Child.childMethod");
//    }

    public String value = "Child";

    @Override
    public void method(){
        System.out.println("Child.method");
    }

}
