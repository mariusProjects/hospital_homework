package com.sda.entities.compositeprimarykeys;

import com.sda.entities.Medication;
import com.sda.entities.Patient;
import com.sda.entities.Physician;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

@Embeddable
public class PrescribePK {
    @ManyToOne
    @JoinColumn(name = "physician")
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "medication")
    private Medication medication;

    @Column(name = "`date`")
    private Timestamp date;

    public PrescribePK() {
    }

    public PrescribePK(Physician physician, Patient patient, Medication medication, Timestamp date) {
        this.physician = physician;
        this.patient = patient;
        this.medication = medication;
        this.date = date;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescribePK that = (PrescribePK) o;
        return Objects.equals(physician, that.physician) &&
                Objects.equals(patient, that.patient) &&
                Objects.equals(medication, that.medication) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physician, patient, medication, date);
    }
}
