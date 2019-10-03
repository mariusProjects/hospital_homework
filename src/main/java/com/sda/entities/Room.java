package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer room_number;
    @Column(name = "roomtype")
    private String roomType;
    @Column(name = "unavailable")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean unavailable;

}
