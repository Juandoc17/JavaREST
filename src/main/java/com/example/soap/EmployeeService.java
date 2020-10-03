package com.example.soap;

import java.util.List;

public interface EmployeeService {
	public Employee getEmployeeByDocumento(String documento);
	public List<Employee> getAllEEmployees();
	public Employee addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(String documento);
	
}
