package com.utbm.fr.lo54.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.utbm.fr.lo54.model.Employee;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
    private EntityManager entityManager;

    @Override
    public List<Employee> get(){

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
        
        return list;
    }

    @Override
    public Employee get(int id){

        return null;
    }

    @Override
    public void save(Employee employee){

    }

    @Override
    public void delete(int id){

    }
}