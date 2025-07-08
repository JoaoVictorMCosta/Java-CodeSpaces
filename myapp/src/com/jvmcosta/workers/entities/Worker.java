package com.jvmcosta.workers.entities;

import java.util.ArrayList;
import java.util.List;

import com.jvmcosta.workers.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    //addContract

    //removeContract
    //Income
}
