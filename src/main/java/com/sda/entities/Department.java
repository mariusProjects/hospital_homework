package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer department_id;

    @Column(name = "`name`")
    private String name;

    @ManyToOne
    @JoinColumn(name = "head")
    private Physician head;


    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Physician getHead() {
        return head;
    }

    public void setHead(Physician head) {
        this.head = head;
    }
}
