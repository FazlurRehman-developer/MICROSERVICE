package com.example.employee_service_6.service;

import com.example.employee_service_6.entity.EmployeeEntity;
import com.example.employee_service_6.model.EmployeeModel;
import com.example.employee_service_6.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public EmployeeModel getEmployeeByid(int id){
        EmployeeEntity employee = employeeRepo.findById(id).get();
        EmployeeModel model = new EmployeeModel();
        model.setId(employee.getId());
        model.setName(employee.getName());
        model.setEmail(employee.getEmail());
        model.setBlood_group(employee.getBlood_group());
        return model;
    }
}
