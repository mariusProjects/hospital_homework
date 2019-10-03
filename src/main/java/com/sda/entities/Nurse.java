package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "nurses")
public class Nurse {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer employeeId;
    @Column(name = "`name`")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "registred")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean registred;
    @Column(name = "ssn")
    private Integer ssn;

    public Nurse(){}

    public Nurse(Integer employeeId, String name, String position, Boolean registred, Integer ssn) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.registred = registred;
        this.ssn = ssn;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getRegistred() {
        return registred;
    }

    public void setRegistred(Boolean registred) {
        this.registred = registred;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }
}
