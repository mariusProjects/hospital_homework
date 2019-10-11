package com.sda.entities;

import com.sda.entities.compositeprimarykeys.TrainedInIdPK;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "trained_in")
public class TrainedIn {
    @EmbeddedId
    private TrainedInIdPK trainedInIdPK;

    @Column(name = "certificationdate")
    private Date certificationDate;

    @Column(name = "certificationexpires")
    private Date certificationExpires;

    @ManyToOne
    @MapsId("physician")
    @JoinColumn(name = "physician")
    private Physician physician;

    @ManyToOne
    @MapsId("treatment")
    @JoinColumn(name = "treatment")
    private Procedure treatment;


    public TrainedInIdPK getTrainedInIdPK() {
        return trainedInIdPK;
    }

    public void setTrainedInIdPK(TrainedInIdPK trainedInIdPK) {
        this.trainedInIdPK = trainedInIdPK;
    }



    /*@ManyToOne
    @JoinColumn(name = "physician")
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "treatment")
    private Procedure treatment;*/



    public TrainedIn() {}

    public TrainedIn(TrainedInIdPK trainedInIdPK, Date certificationDate, Date certificationExpires) {
        this.trainedInIdPK = trainedInIdPK;
        this.certificationDate = certificationDate;
        this.certificationExpires = certificationExpires;
    }


    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/

    /*public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }*/

    /*public Procedure getTreatment() {
        return treatment;
    }

    public void setTreatment(Procedure treatment) {
        this.treatment = treatment;
    }*/

    public Date getCertificationDate() {
        return certificationDate;
    }

    public void setCertificationDate(Date certificationDate) {
        this.certificationDate = certificationDate;
    }

    public Date getCertificationExpires() {
        return certificationExpires;
    }

    public void setCertificationExpires(Date certificationExpires) {
        this.certificationExpires = certificationExpires;
    }
}
