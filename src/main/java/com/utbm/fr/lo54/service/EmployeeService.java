package com.utbm.fr.lo54.service;

import java.util.List;

import com.utbm.fr.lo54.model.Employee;

public interface EmployeeService {
    List<Employee> get();

    Employee get (int id);

    void save(Employee employee);

    void delete(int id);
}