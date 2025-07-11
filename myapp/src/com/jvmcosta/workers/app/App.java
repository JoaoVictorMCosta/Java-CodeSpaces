package com.jvmcosta.workers.app;

import java.util.Scanner;

import com.jvmcosta.workers.entities.Department;
import com.jvmcosta.workers.entities.Worker;
import com.jvmcosta.workers.entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.next();
        Worker worker;

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: (JUNIOR, MID_LEVEL, SENIOR)");
        String level = sc.next();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
        sc.close();
    }
}
