package com.fullstack.controller;

import com.fullstack.entity.Employee;
import com.fullstack.service.IEmployeeService;
import com.fullstack.vo.ResponseVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final IEmployeeService iEmployeeService;

    @PostMapping("/signup")
    public ResponseEntity<Employee> signUp(@RequestBody Employee employee){
        return new ResponseEntity<>(iEmployeeService.signUp(employee), HttpStatus.CREATED);
    }

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String empEmailId, @PathVariable String empPassword){
        return new ResponseEntity<>(iEmployeeService.signIn(empEmailId, empPassword), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{empId}")
    public ResponseEntity<ResponseVO> findById(@PathVariable long empId){
        return new ResponseEntity<>(iEmployeeService.findById(empId), HttpStatus.OK);
    }
}
