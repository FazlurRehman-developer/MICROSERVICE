package com.example.employee_service_6.controller;

import com.example.employee_service_6.entity.EmployeeEntity;
import com.example.employee_service_6.model.EmployeeModel;
import com.example.employee_service_6.repository.EmployeeRepo;
import com.example.employee_service_6.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/employee/{id}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable("id") int id){
        EmployeeModel employee= employeeService.getEmployeeByid(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
