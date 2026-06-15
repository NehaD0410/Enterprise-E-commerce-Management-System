package spring.project.service;

import java.util.List;

import spring.project.entity.Employee;

public interface EmployeeFetchService {
List<Employee>getEmployees();
Employee getEmployeeByid(int id);
}
