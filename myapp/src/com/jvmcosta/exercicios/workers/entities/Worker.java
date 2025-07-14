package com.jvmcosta.exercicios.workers.entities;

import java.util.ArrayList;
import java.util.List;

import com.jvmcosta.exercicios.workers.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, String department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = new Department(department);
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department.getName();
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(String department) {
        this.department = new Department(department);
    }

    public void addContract(HourContract hourContract) {
        contracts.add(hourContract);
    }

    public void removeContract(HourContract hourContract) {
        contracts.remove(hourContract);
    }

    public Double income(int year, int month) {
        double contractsIncome = contracts.stream()
                .filter(c -> c.getDate().getYear() == year && c.getDate().getMonthValue() == month)
                .mapToDouble(HourContract::totalValue).sum();

        return baseSalary + contractsIncome;
    }
}
