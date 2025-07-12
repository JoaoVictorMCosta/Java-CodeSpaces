package com.jvmcosta.workers.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.jvmcosta.workers.entities.Department;
import com.jvmcosta.workers.entities.Worker;
import com.jvmcosta.workers.entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        Worker worker;

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level (JUNIOR, MID_LEVEL, SENIOR): ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String incomeDate = sc.nextLine();
        int month = Integer.parseInt(incomeDate.substring(0, 2));
        int year = Integer.parseInt(incomeDate.substring(3, 7));

        System.out.println(worker.income(year, month));
        sc.close();
    }
}
