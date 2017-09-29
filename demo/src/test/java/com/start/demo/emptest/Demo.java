package com.start.demo.emptest;

import com.start.demo.DemoApplication;
import com.start.demo.dao.EmloyeeDao;
import com.start.demo.pojo.Employee;
import com.start.demo.repository.jpa.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/9/24 0024.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Transactional
public class Demo {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Test
    @Rollback(false)
    public void test1(){
        Employee employee = new Employee();
        employee.setName("dsdsd");
        employeeRepository.save(employee);

    }




}