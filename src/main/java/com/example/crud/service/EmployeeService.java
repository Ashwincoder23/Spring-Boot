package com.example.crud.service;

import com.example.crud.entity.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public String saveEmployee(Employee employee) {
        if (!employeeRepository.existsById(employee.getId())) {
           employeeRepository.save(employee);
            return "Posted successfully";
        } else {
            return "Failed, id already exists";
        }
    }
    public String updateEmployee(Employee employee) {
        if(employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return "Updated successfully";
        } else{
            return "Failed, id not exists";
        }
    }

    public String deleteEmployee(int employeeId) {
      if(employeeRepository.existsById(employeeId)){
          employeeRepository.deleteById(employeeId);
          return "successfully deleted";
      } else{
          return "Failed, Id not found";
      }
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employeeId) {
        if(employeeRepository.existsById(employeeId)) {
            return employeeRepository.findById(employeeId).get();
        } else{
            return null;
        }
    }
}

