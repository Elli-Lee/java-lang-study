package basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = keyboard.nextInt();
        keyboard.nextLine();

        ProductOrder[] orders = new ProductOrder[count];
        for (int i = 0 ; i < count ; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = keyboard.nextLine();
            System.out.print("가격: ");
            int price = keyboard.nextInt();
            System.out.print("수량: ");
            int quantity = keyboard.nextInt();
            keyboard.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ",  가격: " + order.price + ",  수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
