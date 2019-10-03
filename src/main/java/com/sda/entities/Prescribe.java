package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "prescribes")
public class Prescribe {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")  // sa fie toate odata de citit cu many
    @GeneratedValue(generator = "gen")
    private Integer id;

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

    @ManyToOne
    @JoinColumn(name = "appointment")
    private Appointment appointment;

    @Column(name = "dose")
    private String dose;
}
