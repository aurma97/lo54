package com.utbm.fr.lo54.dao;

import java.util.List;

import com.utbm.fr.lo54.model.Employee;

public interface EmployeeDao {
    
    List<Employee> get();

    Employee get (int id);

    void save(Employee employee);

    void delete(int id);
}