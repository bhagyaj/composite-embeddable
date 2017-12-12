package com.bhagya.service.Impl;

import com.bhagya.model.Department;
import com.bhagya.model.DepartmentId;
import com.bhagya.repository.DepartmentRepository;
import com.bhagya.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department getDepartment(String rnD, String kalutara) {
        DepartmentId departmentId = new DepartmentId();
        departmentId.setName("RnD");
        departmentId.setLocation("Kalutara");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
