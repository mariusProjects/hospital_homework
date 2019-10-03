package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "on_call")
public class OnCall {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer id;
    @Column(name = "oncallstart")
    private Timestamp oncallStart;
    @Column(name = "oncallend")
    private Timestamp oncallEnd;
}
