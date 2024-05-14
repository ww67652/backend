package com.fudan.studyroom.entity;

import java.io.Serializable;
import java.util.Date;

public class Room implements Serializable {
    private Integer id;

    private String address;

    private Boolean available;

    private Boolean type;

    private Date openStartTime;

    private Date openEndTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getOpenStartTime() {
        return openStartTime;
    }

    public void setOpenStartTime(Date openStartTime) {
        this.openStartTime = openStartTime;
    }

    public Date getOpenEndTime() {
        return openEndTime;
    }

    public void setOpenEndTime(Date openEndTime) {
        this.openEndTime = openEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", available=").append(available);
        sb.append(", type=").append(type);
        sb.append(", openStartTime=").append(openStartTime);
        sb.append(", openEndTime=").append(openEndTime);
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