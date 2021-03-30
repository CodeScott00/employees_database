package com.example.codeclan.employee_duo_lab.repositories;

import com.example.codeclan.employee_duo_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
