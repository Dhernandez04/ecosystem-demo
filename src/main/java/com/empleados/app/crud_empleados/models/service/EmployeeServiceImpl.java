package com.empleados.app.crud_empleados.models.service;

import com.empleados.app.crud_empleados.models.entity.Employee;
import com.empleados.app.crud_empleados.models.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepository _employeeRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return this._employeeRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        this._employeeRepository.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public Employee findOne(Long id) {
        return this._employeeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
    this._employeeRepository.deleteById(id);
    }
}
