package com.jvmcosta.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.jvmcosta.entities.Employee;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> empList = new ArrayList<Employee>();

        System.out.print("How many employess will be registered? ");
        int n = sc.nextInt();
        System.out.println();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            empList.add(new Employee(id,name,salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int empId = sc.nextInt();
        Employee emp = empList.stream().filter(employee -> employee.getId() == empId).findFirst().orElse(null);
        
        if(emp == null){
            System.out.println("This ID does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : empList) {
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
