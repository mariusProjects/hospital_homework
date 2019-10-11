package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    @Column(name = "ssn")
    private Integer ssn;

    @Column(name = "`name`")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "phone")
    private String phone;

    @Column(name = "insurance_id")
    private Integer insuranceId;

    @ManyToOne
    @JoinColumn(name = "pcp_physician_id")
    private Physician pcpPhysicianId;


    public Patient() {
    }

    public Patient(Integer ssn, String name, String adress, String phone, Integer insuranceId, Physician pcpPhysicianId) {
        this.ssn = ssn;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.insuranceId = insuranceId;
        this.pcpPhysicianId = pcpPhysicianId;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Physician getPcpPhysicianId() {
        return pcpPhysicianId;
    }

    public void setPcpPhysicianId(Physician pcpPhysicianId) {
        this.pcpPhysicianId = pcpPhysicianId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(ssn, patient.ssn) &&
                Objects.equals(name, patient.name) &&
                Objects.equals(adress, patient.adress) &&
                Objects.equals(phone, patient.phone) &&
                Objects.equals(insuranceId, patient.insuranceId) &&
                Objects.equals(pcpPhysicianId, patient.pcpPhysicianId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, name, adress, phone, insuranceId, pcpPhysicianId);
    }
}
