package com.empleados.app.crud_empleados.models.service;

import com.empleados.app.crud_empleados.models.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();
    public void save(Employee employee);
    Employee findOne(Long id);
    public void delete(Long id);
}
