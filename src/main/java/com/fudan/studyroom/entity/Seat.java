package com.fudan.studyroom.entity;


import java.io.Serializable;

public class Seat implements Serializable {
    private Integer id;

    private Integer rid;

    private Boolean ocupied;

    private Byte type;

    private Boolean charge;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Boolean getOcupied() {
        return ocupied;
    }

    public void setOcupied(Boolean ocupied) {
        this.ocupied = ocupied;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getCharge() {
        return charge;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rid=").append(rid);
        sb.append(", ocupied=").append(ocupied);
        sb.append(", type=").append(type);
        sb.append(", charge=").append(charge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
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
            && (this.getOcupied() == null ? other.getOcupied() == null : this.getOcupied().equals(other.getOcupied()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getOcupied() == null) ? 0 : getOcupied().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        return result;
    }
}