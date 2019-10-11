package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "undergoes")
public class Undergoes {


    private Physician physician;
    private Nurse assistingnurse;


}
