package com.bhagya.service.Impl;

import com.bhagya.model.DepartmentId;
import com.bhagya.model.Employee;
import com.bhagya.model.EmployeeId;
import com.bhagya.repository.EmployeeRepository;
import com.bhagya.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(String bhagya, String rnD, String kalutara) {
        EmployeeId employeeId = new EmployeeId();
        DepartmentId departmentId = new DepartmentId();
        departmentId.setLocation("Kalutara");
        departmentId.setName("RnD");
        employeeId.setDepartmentId(departmentId);
        employeeId.setName("Bhagya");
        return employeeRepository.findByEmployeeId(employeeId);
    }
}
