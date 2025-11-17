package com.fullstack.controller;

import com.fullstack.entity.Department;
import com.fullstack.service.IDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final IDepartmentService iDepartmentService;

    @PostMapping("/save")
    public ResponseEntity<Department> save(@RequestBody Department department){
        return new ResponseEntity<>(iDepartmentService.save(department), HttpStatus.CREATED);
    }

    @GetMapping("/findbyid/{deptId}")
    public ResponseEntity<Optional<Department>> findById(@PathVariable long deptId){
        return new ResponseEntity<>(iDepartmentService.findById(deptId), HttpStatus.OK);
    }
}
