package com.example.componentScan.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Manager {
    @Autowired // this using constructor auto wire
    @Qualifier("employee1")
    public Employee employee;

//    @Autowired // this using constructor auto wire
//    @Qualifier("employee1") // not support in constructor
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manger{" +
                "employee=" + employee +
                '}';
    }
}
