package com.fudan.studyroom.entity;


import lombok.Getter;

import java.io.Serializable;

@Getter
public class Seat implements Serializable {
    private Integer id;

    private Integer rid;

    private Boolean occupied;

    private Byte type;

    private Boolean charge;

    private static final long serialVersionUID = 1L;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", rid=" + rid +
                ", occupied=" + occupied +
                ", type=" + type +
                ", charge=" + charge +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Seat other = (Seat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getOccupied() == null ? other.getOccupied() == null : this.getOccupied().equals(other.getOccupied()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getOccupied() == null) ? 0 : getOccupied().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        return result;
    }
}