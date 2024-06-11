package com.fudan.studyroom.entity;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class Room implements Serializable {
    private Integer id;

    private String address;

    private Boolean available;

    private Boolean type;

    @Getter
    private Date openStartTime;

    @Getter
    private Date openEndTime;

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    private int seatNum;

    private static final long serialVersionUID = 1L;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setOpenStartTime(Date openStartTime) {
        this.openStartTime = openStartTime;
    }

    public void setOpenEndTime(Date openEndTime) {
        this.openEndTime = openEndTime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", address=" + address +
                ", available=" + available +
                ", type=" + type +
                ", openStartTime=" + openStartTime +
                ", openEndTime=" + openEndTime +
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
        Room other = (Room) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAvailable() == null ? other.getAvailable() == null : this.getAvailable().equals(other.getAvailable()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getOpenStartTime() == null ? other.getOpenStartTime() == null : this.getOpenStartTime().equals(other.getOpenStartTime()))
            && (this.getOpenEndTime() == null ? other.getOpenEndTime() == null : this.getOpenEndTime().equals(other.getOpenEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getOpenStartTime() == null) ? 0 : getOpenStartTime().hashCode());
        result = prime * result + ((getOpenEndTime() == null) ? 0 : getOpenEndTime().hashCode());
        return result;
    }
}