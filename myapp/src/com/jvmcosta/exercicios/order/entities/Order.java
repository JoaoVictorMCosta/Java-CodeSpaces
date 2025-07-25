package com.jvmcosta.exercicios.order.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jvmcosta.entities.enums.OrderStatus;

public class Order {
    private LocalDate moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderItem = new ArrayList<>();

    public Order(LocalDate moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void addItem(OrderItem item) {
        orderItem.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItem.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem orderItem : orderItem) {
            sum += orderItem.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(moment + ", " + status + ", " + client);

        return sb.toString();
    }

}
