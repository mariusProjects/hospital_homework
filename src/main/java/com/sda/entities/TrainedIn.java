package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "trained_in")
public class TrainedIn {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "physician")
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "treatment")
    private Procedure treatment;

    @Column(name = "certificationdate")
    private Date certificationDate;

    @Column(name = "certificationexpires")
    private Date certificationExpires;

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

    public Procedure getTreatment() {
        return treatment;
    }

    public void setTreatment(Procedure treatment) {
        this.treatment = treatment;
    }

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
