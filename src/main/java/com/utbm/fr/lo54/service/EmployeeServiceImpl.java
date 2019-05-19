package com.utbm.fr.lo54.service;

import java.util.List;

import javax.transaction.Transactional;

import com.utbm.fr.lo54.dao.EmployeeDao;
import com.utbm.fr.lo54.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public List<Employee> get(){
        return employeeDao.get();
    }

    @Transactional
    @Override
    public Employee get(int id){

        return null;
    }

    @Transactional
    @Override
    public void save(Employee employee){

    }

    @Transactional
    @Override
    public void delete(int id){

    }
}