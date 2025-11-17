package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import com.fullstack.vo.Department;
import com.fullstack.vo.ResponseVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService{

    private final EmployeeRepository employeeRepository;

    private final DepartmentClient departmentClient;

    @Override
    public Employee signUp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {

        Employee employee = employeeRepository.findByEmpEmailIdAndEmpPassword(empEmailId, empPassword);
        return employee != null;
    }

    @Override
    public ResponseVO findById(long empId) {

        ResponseVO responseVO = new ResponseVO();

        Employee employee = employeeRepository.findByEmpId(empId);

        responseVO.setEmployee(employee);

        Department department = departmentClient.findById(employee.getDeptId());

        responseVO.setDepartment(department);

        return responseVO;
    }
}
