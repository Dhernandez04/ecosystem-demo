package com.empleados.app.crud_empleados.models.repository;

import com.empleados.app.crud_empleados.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
