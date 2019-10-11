package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer appointmentId;

    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "prepnurse")
    private Nurse prepnurse;

    @ManyToOne
    @JoinColumn(name = "physician")
    private Physician physician;

    @Column(name = "start_dt_time")
    private Timestamp startDateTime;

    @Column(name = "end_dt_time")
    private Timestamp endDateTime;

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getPrepnurse() {
        return prepnurse;
    }

    public void setPrepnurse(Nurse prepnurse) {
        this.prepnurse = prepnurse;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(appointmentId, that.appointmentId) &&
                Objects.equals(patient, that.patient) &&
                Objects.equals(prepnurse, that.prepnurse) &&
                Objects.equals(physician, that.physician) &&
                Objects.equals(startDateTime, that.startDateTime) &&
                Objects.equals(endDateTime, that.endDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, patient, prepnurse, physician, startDateTime, endDateTime);
    }
}
