package com.example.service;

/**
 * Created by alan on 5/8/17.
 */
import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();

}
