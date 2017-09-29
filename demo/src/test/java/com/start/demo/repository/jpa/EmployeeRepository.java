package com.start.demo.repository.jpa;

import com.start.demo.pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


     
}
