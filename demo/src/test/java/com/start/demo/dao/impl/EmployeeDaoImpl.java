package com.start.demo.dao.impl;

import com.start.demo.dao.EmloyeeDao;
import com.start.demo.pojo.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
@Repository
public class EmployeeDaoImpl implements EmloyeeDao {
    @PersistenceContext
    protected EntityManager em;

    @Override
    public void save(Employee employee) {
        em.persist(employee);
    }
}
