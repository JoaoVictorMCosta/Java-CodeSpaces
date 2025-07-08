package com.jvmcosta.app;

import java.time.LocalDate;

import com.jvmcosta.entities.Order;
import com.jvmcosta.entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        Order order = new Order(1080,LocalDate.now(),OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
