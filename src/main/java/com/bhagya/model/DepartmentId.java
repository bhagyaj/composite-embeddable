package com.bhagya.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class DepartmentId implements Serializable {
    @Column(name = "DepartmentName")
    private String name;
    @Column(name = "DepartmentLocation")
    private String location;


}
