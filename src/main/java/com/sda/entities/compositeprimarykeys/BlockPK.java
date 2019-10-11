package com.sda.entities.compositeprimarykeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class BlockPK {
    @Column(name = "blockfloor")
    private Integer blockfloor;
    @Column(name = "blockcode")
    private Integer blockcode;

    public BlockPK() {
    }

    public BlockPK(Integer blockfloor, Integer blockcode) {
        this.blockfloor = blockfloor;
        this.blockcode = blockcode;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockPK blockPK = (BlockPK) o;
        return Objects.equals(blockfloor, blockPK.blockfloor) &&
                Objects.equals(blockcode, blockPK.blockcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockfloor, blockcode);
    }
}
