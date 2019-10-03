package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Block {
    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    private Integer id;
    @Column(name = "blockfloor")
    private Integer blockfloor;
    @Column(name = "blockcode")
    private Integer blockcode;

    public Block(Integer id, Integer blockfloor, Integer blockcode) {
        this.id = id;
        this.blockfloor = blockfloor;
        this.blockcode = blockcode;
    }

    public Block() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlockfloor() {
        return blockfloor;
    }

    public void setBlockfloor(Integer blockfloor) {
        this.blockfloor = blockfloor;
    }

    public Integer getBlockcode() {
        return blockcode;
    }

    public void setBlockcode(Integer blockcode) {
        this.blockcode = blockcode;
    }
}
