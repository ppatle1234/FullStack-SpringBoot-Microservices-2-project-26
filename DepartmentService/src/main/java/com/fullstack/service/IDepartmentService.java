package com.fullstack.service;

import com.fullstack.entity.Department;

import java.util.Optional;

public interface IDepartmentService {

    Department save(Department department);

    Optional<Department> findById(long deptId);
}
