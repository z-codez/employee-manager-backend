package com.zuma.employeemanager.service;

import com.zuma.employeemanager.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(Long id);

    public Employee findEmployeeById(Long id);
}
