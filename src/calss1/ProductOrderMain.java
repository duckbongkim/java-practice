package calss1;

public class ProductOrderMain {
    public static void main(String[] args){
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.name = "두부";
        productOrder1.price = 1000;
        productOrder1.count = 10;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.name = "사이다";
        productOrder2.price = 1200;
        productOrder2.count = 10;


        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.name = "콜라";
        productOrder3.price = 1300;
        productOrder3.count = 10;

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = productOrder1;
        orders[1] = productOrder2;
        orders[2] = productOrder3;


        int totalPrice = 0;
        for(ProductOrder o : orders){
            System.out.println("상품명: "+o.name+" 가격: "+o.price+" 수량: "+o.count);
            totalPrice += o.price*o.count;
            System.out.println("총가격: "+totalPrice+"원");
        }
    }
}
