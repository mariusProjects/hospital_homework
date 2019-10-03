package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "affiliated_with")
public class AffiliatedWith {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "physician_id")
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "primaryaffiliation")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean primaryAffiliation;

    public AffiliatedWith(Integer id, Physician physician, Department department, Boolean primaryAffiliation) {
        this.id = id;
        this.physician = physician;
        this.department = department;
        this.primaryAffiliation = primaryAffiliation;
    }

    public AffiliatedWith() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Boolean getPrimaryAffiliation() {
        return primaryAffiliation;
    }

    public void setPrimaryAffiliation(Boolean primaryAffiliation) {
        this.primaryAffiliation = primaryAffiliation;
    }
}
