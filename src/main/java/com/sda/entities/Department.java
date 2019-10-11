package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(department_id, that.department_id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_id, name, head);
    }
}
