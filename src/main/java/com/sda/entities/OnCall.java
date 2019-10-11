package com.sda.entities;

import com.sda.entities.compositeprimarykeys.BlockPK;
import com.sda.entities.compositeprimarykeys.OnCallPK;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "on_call")
public class OnCall {
    @EmbeddedId
    private OnCallPK onCallPK;

    @OneToMany(mappedBy = "onCall")
    @ElementCollection(targetClass = Block.class)
    private List<Block> blocks;

    /*@OneToMany(mappedBy = "blockPKOnCall")
    @JoinColumns({
        @JoinColumn(name = "blockfloor"),
        @JoinColumn(name = "blockcode"),
    })
    @ElementCollection(targetClass = Block.class)
    private List<Block> blockList;*/

    public OnCall() {
    }
}
