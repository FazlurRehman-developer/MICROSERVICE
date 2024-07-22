package com.example.employee_service_6.repository;

import com.example.employee_service_6.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface EmployeeRepo extends JpaRepository <EmployeeEntity,Integer>{

}
