package calss1.access;

import calss1.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField=1;
        data.publicMethod();

//        data.defaultField=2;
//        data.defaultMethod();

//        data.privateField=3;
//        data.privateField();

        data.innerAccess();
    }
}
