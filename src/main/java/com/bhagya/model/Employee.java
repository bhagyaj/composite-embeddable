package com.bhagya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @EmbeddedId
    EmployeeId employeeId;

    @Column(name = "Designation")
    private String designation;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "DepartmentName", referencedColumnName = "DepartmentName", insertable = false, updatable = false),
            @JoinColumn(name = "DepartmentLocation", referencedColumnName = "DepartmentLocation", insertable = false, updatable = false),
    })
    @JsonIgnore
    private Department department;

    @Column(name = "Salary")
    private Double salary;


    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
