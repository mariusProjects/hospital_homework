package com.sda.entities;

import com.sda.entities.compositeprimarykeys.AffiliatedWithPK;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "affiliated_with")
public class AffiliatedWith {

    @EmbeddedId
    private AffiliatedWithPK affiliatedWithPK;

    @Column(name = "primaryaffiliation")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean primaryAffiliation;

    @ManyToOne
    @MapsId("physician_id")
    @JoinColumn(name = "physician_id")
    private Physician physicianId;

    @ManyToOne
    @MapsId("department_id")
    @JoinColumn(name = "department_id")
    private Department departmentId;



    public AffiliatedWith() {}

    public AffiliatedWith(AffiliatedWithPK affiliatedWithPK, Boolean primaryAffiliation) {
        this.affiliatedWithPK = affiliatedWithPK;
        this.primaryAffiliation = primaryAffiliation;
    }


    public Boolean getPrimaryAffiliation() {
        return primaryAffiliation;
    }

    public void setPrimaryAffiliation(Boolean primaryAffiliation) {
        this.primaryAffiliation = primaryAffiliation;
    }


    public AffiliatedWithPK getAffiliatedWithPK() {
        return affiliatedWithPK;
    }

    public void setAffiliatedWithPK(AffiliatedWithPK affiliatedWithPK) {
        this.affiliatedWithPK = affiliatedWithPK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AffiliatedWith that = (AffiliatedWith) o;
        return Objects.equals(affiliatedWithPK, that.affiliatedWithPK) &&
                Objects.equals(primaryAffiliation, that.primaryAffiliation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affiliatedWithPK, primaryAffiliation);
    }
}
