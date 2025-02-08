package calss1.access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;


    public void publicMethod(){
        System.out.println("퍼블릭 메서드 호출: "+publicField);
    }

    void defaultMethod(){
        System.out.println("디폴트 메서드 호출: "+defaultField);
    }

    private void PrivateMethod(){
        System.out.println("프라빗메서드 호출"+ privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        PrivateMethod();
    }
}
