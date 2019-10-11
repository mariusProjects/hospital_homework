package com.sda.entities;

import com.sda.entities.compositeprimarykeys.BlockPK;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "block")
public class Block {


    @EmbeddedId
    private BlockPK blockPK;


    @ManyToOne
    @MapsId("blockfloor")
    @JoinColumn(name = "blockfloor")
    private OnCall onCallBlockFloor;

    @ManyToOne
    @MapsId("blockcode")
    @JoinColumn(name = "blockcode")
    private OnCall onCallBlockCode;

    @ManyToOne
    @JoinColumn(name = "onCallPK")
    private OnCall onCalll;





    public Block() {
    }

    public Block(BlockPK blockPK) {
        this.blockPK = blockPK;
    }

    public BlockPK getBlockPK() {
        return blockPK;
    }

    public void setBlockPK(BlockPK blockPK) {
        this.blockPK = blockPK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(blockPK, block.blockPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockPK);
    }
}
