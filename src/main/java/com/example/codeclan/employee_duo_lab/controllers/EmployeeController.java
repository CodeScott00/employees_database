package com.example.codeclan.employee_duo_lab.controllers;

import com.example.codeclan.employee_duo_lab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


}
