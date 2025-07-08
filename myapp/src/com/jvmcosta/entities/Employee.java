package com.jvmcosta.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){
        
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void increaseSalary(double percentage){
        salary+=(salary*(percentage/100));
    }

    public String toString(){
        return String.format("%d, %s, %.2f",getId(),getName(),(getSalary()));
    }

}
