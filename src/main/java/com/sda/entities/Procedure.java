package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "PROCEDURESs")
public class Procedure {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer code;
    @Column(name = "`name`")
    private String name;
    @Column(name = "cost")
    private Double cost;

}
