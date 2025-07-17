package com.jvmcosta.exercicios.order.app;

import java.time.LocalDate;
import java.util.Scanner;

import com.jvmcosta.entities.enums.OrderStatus;
import com.jvmcosta.exercicios.order.entities.Client;
import com.jvmcosta.exercicios.order.entities.Order;
import com.jvmcosta.exercicios.order.entities.OrderItem;
import com.jvmcosta.exercicios.order.entities.Product;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = "Alex Green";
        System.out.print("Email: ");
        String email = "alex@gmail.com";
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = "15/03/1985";

        Order order;
        
        System.out.println("Enter order data: ");
        System.out.println("Status:");
        String status = "PROCESSING";
        System.out.println("How many items to this order? ");

        order = new Order(LocalDate.now(), OrderStatus.valueOf(status),new Client(name,email,birthDate));

        int n = 2;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #"+(i+1)+" item data: ");
            System.out.print("Product name: ");
            String itemName = sc.nextLine();
            System.out.print("Product price: ");
            double itemPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 
            order.addItem(new OrderItem(quantity, itemPrice, new Product(itemName,itemPrice)));
        }

        System.out.println();
        System.out.println("ORDER SUMARY:");
        System.out.println();
        
        System.out.println(order.toString());

        sc.close();
    }
}
