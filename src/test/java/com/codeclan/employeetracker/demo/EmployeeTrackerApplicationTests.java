package com.codeclan.employeetracker.demo;

import com.codeclan.employeetracker.demo.models.Department;
import com.codeclan.employeetracker.demo.models.Employee;
import com.codeclan.employeetracker.demo.models.Project;
import com.codeclan.employeetracker.demo.repositories.DepartmentRepository;
import com.codeclan.employeetracker.demo.repositories.EmployeeRepository;
import com.codeclan.employeetracker.demo.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Development");
		departmentRepository.save(department);

		Employee employee = new Employee("Grant", "Rutherford", 1234, department);
		employeeRepository.save(employee);

		Project project = new Project("GenerationType: Identity", 3);
		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
