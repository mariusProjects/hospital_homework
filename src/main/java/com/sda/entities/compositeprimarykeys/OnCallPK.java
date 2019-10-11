package com.sda.entities.compositeprimarykeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
public class OnCallPK implements Serializable {
    @Column(name = "nurse")
    private Integer nurse;
    @Embedded
    private BlockPK blockPKOnCall;

    @Column(name = "oncallstart")
    private Timestamp oncallStart;

    @Column(name = "oncallend")
    private Timestamp oncallEnd;




}
