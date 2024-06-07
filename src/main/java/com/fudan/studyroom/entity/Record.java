package com.fudan.studyroom.entity;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class Record implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer rid;

    private Integer sid;

    private Date reserveTime;

    private Date startTime;

    private Date endTime;

    private Boolean attendance;

    private static final long serialVersionUID = 1L;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setAttendance(Boolean attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
                ", sid=" + sid +
                ", reserveTime=" + reserveTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", attendance=" + attendance +
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
        Record other = (Record) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getReserveTime() == null ? other.getReserveTime() == null : this.getReserveTime().equals(other.getReserveTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getAttendance() == null ? other.getAttendance() == null : this.getAttendance().equals(other.getAttendance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getReserveTime() == null) ? 0 : getReserveTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getAttendance() == null) ? 0 : getAttendance().hashCode());
        return result;
    }
}