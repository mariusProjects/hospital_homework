package com.sda.entities.compositeprimarykeys;

import com.sda.entities.Department;
import com.sda.entities.Physician;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AffiliatedWithPK implements Serializable {



    @Column(name = "physician_id")
    private Integer physicianId;


    @Column(name = "department_id")
    private Integer departmentId;

    public AffiliatedWithPK() {}


    public AffiliatedWithPK(Integer physicianId, Integer departmentId) {
        this.physicianId = physicianId;
        this.departmentId = departmentId;
    }

    public Integer getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(Integer physicianId) {
        this.physicianId = physicianId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AffiliatedWithPK that = (AffiliatedWithPK) o;
        return Objects.equals(physicianId, that.physicianId) &&
                Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicianId, departmentId);
    }
}
