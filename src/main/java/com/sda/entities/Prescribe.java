package com.sda.entities;

import com.sda.entities.compositeprimarykeys.PrescribePK;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "prescribes")
public class Prescribe {

    @EmbeddedId
   private PrescribePK prescribePK;

    @ManyToOne
    @JoinColumn(name = "appointment")
    private Appointment appointment;

    @Column(name = "dose")
    private String dose;

    public Prescribe() {
    }

    public Prescribe(PrescribePK prescribePK, Appointment appointment, String dose) {
        this.prescribePK = prescribePK;
        this.appointment = appointment;
        this.dose = dose;
    }

    public PrescribePK getPrescribePK() {
        return prescribePK;
    }

    public void setPrescribePK(PrescribePK prescribePK) {
        this.prescribePK = prescribePK;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescribe prescribe = (Prescribe) o;
        return Objects.equals(prescribePK, prescribe.prescribePK) &&
                Objects.equals(appointment, prescribe.appointment) &&
                Objects.equals(dose, prescribe.dose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescribePK, appointment, dose);
    }
}
