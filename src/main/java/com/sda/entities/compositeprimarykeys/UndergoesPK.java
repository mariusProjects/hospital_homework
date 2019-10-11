package com.sda.entities.compositeprimarykeys;

import com.sda.entities.Patient;
import com.sda.entities.Physician;
import com.sda.entities.Procedure;
import com.sda.entities.Stay;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Embeddable
public class UndergoesPK {
    @Column(name = "patient")
    private Patient patient;
    @Column (name = "`procedure`")
    private Procedure procedure;
    @Column(name = "stay")
    private Stay stay;
    @Column(name = "`date`")
    private Date date;

    @OneToMany(mappedBy = "patient")
    @ElementCollection(targetClass = Patient.class)
    private List<Patient> patientList;

    /*@OneToMany (mappedBy = "")
    @JoinColumn(name = "`procedure`")
    private Procedure procedure;


    private Stay stay;
    private Date date;*/
}
