package com.Inheritance.leveltwo;

public class OrderMain {

	public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-01-01");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-01-02", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-01-03", "TRK67890", "2025-01-05");

        Order order2 = new DeliveredOrder(
                "ORD003", "2025-01-03", "TRK67890", "2025-01-05");

        order2.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
