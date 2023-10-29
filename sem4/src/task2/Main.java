package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Иванов", "Петр", "Сергеевич", 22, "89223111214");
        Customer customer2 = new Customer("Сидоров", "Арсений", "Петрович", 30, "89423161218");

        // Не существующий покупатель
        Customer customer3 = new Customer("Елисеев", "Егор", "Михайлович", 40, "89444461289");

        customers.add(customer1);
        customers.add(customer2);

        // Вывод всех добавленных в массив покупателей
        System.out.println("Покупатели:");
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }

        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Агуша", 46);
        Product product2 = new Product("Coca-Cola", 100);
        Product product3 = new Product("Молоко", 63);
        Product product4 = new Product("Барни", 109);
        Product product5 = new Product("Колбаса", 160);

        // Не существующий товар
        Product product6 = new Product("Груша", 50);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        // Вывод всех добавленных продуктов
        System.out.println();
        System.out.println("Продукты:");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        List<Order> orders = new ArrayList<>(5);
        orders.add(Order.makePurchase(customer1, product1, 3, customers, products));
        orders.add(Order.makePurchase(customer2, product2, 5, customers, products));

        // Передано неверное количество >100
        orders.add(Order.makePurchase(customer1, product3, 101, customers, products));

        // Покупка не существующего товара
        orders.add(Order.makePurchase(customer2, product6, 10, customers, products));

        // Совершение покупки не существующим покупателем
        orders.add(Order.makePurchase(customer3, product5, 20, customers, products));

        // Вывод всех совершенных заказов
        System.out.println();
        System.out.println("Совершенные заказы:");
        for (Order order : orders) {
            if (order == null) {
                continue;
            }
            System.out.println(order);
        }
        System.out.println();
        System.out.printf("Совершено всего %s покупки", Order.counter(orders));
    }
}