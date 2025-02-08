package calss1.Packages;

import calss1.Packages2.Test;

public class Package {
    public static void main(String[] args) {
        Test test = new Test();
        Data data = new Data();

        data.value = 70;
        test.name = "동진";

        System.out.println(test.name+data.value);

    }
}
