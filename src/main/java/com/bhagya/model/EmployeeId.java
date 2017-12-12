package com.bhagya.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class EmployeeId implements Serializable {

    DepartmentId departmentId;
    @Column(name = "Name")
    private String name;

}
