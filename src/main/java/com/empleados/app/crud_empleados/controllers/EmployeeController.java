package com.empleados.app.crud_empleados.controllers;

import com.empleados.app.crud_empleados.models.entity.Employee;
import com.empleados.app.crud_empleados.models.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl _employeeServiceImpl;

    @GetMapping("employees")
    public List<Employee> findAll(){
      return  this._employeeServiceImpl.findAll();
    }
    @PostMapping("employee")
    public void save(@RequestBody Employee employee){
        this._employeeServiceImpl.save(employee);
    }
    @GetMapping("employee/{id}")
    public Employee findById(@PathVariable Long id){
        return this._employeeServiceImpl.findOne(id);
    }
    @DeleteMapping("employee/{id}")
    public void deleteById(@PathVariable Long id){
         this._employeeServiceImpl.delete(id);
    }
    @PutMapping("employee")
    public void update(@RequestBody Employee employee) {
        this._employeeServiceImpl.save(employee);
    }
}
