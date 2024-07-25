package com.jumong.employeemanagementsystem.data.repositories;

import com.jumong.employeemanagementsystem.data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
