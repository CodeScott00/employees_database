package com.example.codeclan.employee_duo_lab;

import com.example.codeclan.employee_duo_lab.models.Department;
import com.example.codeclan.employee_duo_lab.models.Employee;
import com.example.codeclan.employee_duo_lab.repositories.DepartmentRepository;
import com.example.codeclan.employee_duo_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDuoLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartmentSave(){
		Department department = new Department("Wet Biscuit");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jeromy", "Beadle", 1001, department);
		Employee employee2 = new Employee("Sam", "Cooke", 2002, department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);


	}





}
