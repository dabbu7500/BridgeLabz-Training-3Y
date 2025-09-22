import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
    }
}

public class EcommercePlatformDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Emily");
        Order order = new Order(101);

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        order.addProduct(p1);
        order.addProduct(p2);

        customer.placeOrder(order);
    }
}
