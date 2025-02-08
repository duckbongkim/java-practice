package calss1.access.a;

public class AcccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField=1;
        data.publicMethod();

        data.defaultField=2;
        data.defaultMethod();

//        data.privateField=3;
//        data.PrivateMethod();

        data.innerAccess();
    }
}
