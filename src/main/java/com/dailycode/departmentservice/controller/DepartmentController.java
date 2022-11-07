package com.dailycode.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycode.departmentservice.entity.Department;
import com.dailycode.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/departments")
@Slf4j
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department ); 
    }

    @GetMapping("/{departmentId}")
    public Optional<Department> finDepartmentById(@PathVariable Long departmentId) {
        log.info("Inside finDepartmentById method of DepartmentController");
        return departmentService.finDepartmentById(departmentId);
    }

}
