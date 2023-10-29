package task2;

import java.util.List;

public class Order {
    protected Customer customer;
    protected Product product;
    protected int quantity;

    public Order(Customer customer, Product product, int quantity) {
        customer = this.customer;
        product = this.product;
        quantity = this.quantity;
    }

    public static Order makePurchase(Customer customer, Product product, int quantity, List<Customer> customers, List<Product> products) throws CustomerException, ProductException, AmountException {
        try {
            if (!customers.contains(customer)) {
                throw new CustomerException();
            }
            if (!products.contains(product)) {
                throw new ProductException();
            }
            if (quantity < 0 || quantity > 100) {
                throw new AmountException();
            }
            return new Order(customer, product, quantity);
        } catch (CustomerException | ProductException | AmountException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int counter(List<Order> orders) {
        try {
            int countNotNull = 0;
            for (Order order : orders) {
                if (order != null) {
                    countNotNull++;
                }
            }
            return countNotNull;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }
}