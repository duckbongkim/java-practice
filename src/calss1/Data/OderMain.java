package calss1.Data;

public class OderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부",1000,10);
        orders[1] = createOrder("김치",1000,10);
        orders[2] = createOrder("햄",1000,10);

        printOrders(orders);

        int totalPrice = getTotalPrice(orders);
        System.out.println("총합계 금액: "+totalPrice);

    }

    static ProductOrder createOrder(String name, int price, int count){
        ProductOrder order = new ProductOrder();
        order.name = name;
        order.price = price;
        order.count = count;

        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order:orders){
            System.out.println("상품명: "+order.name+", 가격: "+order.price+", 수량: "+order.count);
        }
    }

    static int getTotalPrice(ProductOrder[] orders){
        int totalPrice =0;
        for(ProductOrder order : orders){
            totalPrice += order.price*order.count;
        }
        return totalPrice;
    }

}
