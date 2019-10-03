package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "undergoes")
public class Undergoes {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;
    @ManyToOne
    private Procedure procedure;
    private Stay stay;
    private Date date;
    private Physician physician;
    private Nurse assistingnurse;


}
