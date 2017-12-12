package com.bhagya.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Department")
public class Department {

    @EmbeddedId
    DepartmentId departmentId;
    @Column(name = "EmpNumber")
    private Integer empNumber;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "department")
    private Set<Employee> employees;

    public DepartmentId getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(DepartmentId departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
