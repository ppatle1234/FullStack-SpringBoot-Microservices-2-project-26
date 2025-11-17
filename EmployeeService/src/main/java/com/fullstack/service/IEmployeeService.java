package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.vo.ResponseVO;

public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);

    ResponseVO findById(long empId);
}
