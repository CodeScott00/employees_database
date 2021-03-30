package com.example.codeclan.employee_duo_lab.repositories;

import com.example.codeclan.employee_duo_lab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
