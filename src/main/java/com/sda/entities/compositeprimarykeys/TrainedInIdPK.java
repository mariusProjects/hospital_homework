package com.sda.entities.compositeprimarykeys;

import com.sda.entities.Physician;
import com.sda.entities.Procedure;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class TrainedInIdPK implements Serializable {

    @Column(name = "physician")
    private Integer physicianId;


    @Column(name = "treatment")
    private Integer treatmentId;


    public TrainedInIdPK() {}


    public TrainedInIdPK(Integer physicianId, Integer treatmentId) {
        this.physicianId = physicianId;
        this.treatmentId = treatmentId;
    }

    public Integer getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(Integer physicianId) {
        this.physicianId = physicianId;
    }

    public Integer getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(Integer treatmentId) {
        this.treatmentId = treatmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainedInIdPK that = (TrainedInIdPK) o;
        return Objects.equals(physicianId, that.physicianId) &&
                Objects.equals(treatmentId, that.treatmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicianId, treatmentId);
    }
}
