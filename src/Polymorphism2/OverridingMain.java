package Polymorphism2;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child->Child");
        System.out.println("value= "+child.value); // child

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent->Parent");
        System.out.println("value= "+parent.value);// parent
        parent.method();

        // 부모 변수가 자식 인스턴스를 참조(다형성 참조)
        Parent poly = new Child();
        System.out.println("Parent->Child");
        System.out.println("value= "+poly.value); // parent
        poly.method();  // parent.method -> child.method

    }


}
