package com.example.demo.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clock")
public class Clock  {
    @Id
    @Column(name = "clockId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clockId;
    private long tramId;
    private long trolleyId;
    private long busId;
    private long minibussId;
    private String time;


    public Clock(long clockIdId, long tramId, long trolleyId, long busId, long minibussId, String time) {
        this.clockId = clockId;
        this.tramId = tramId;
        this.trolleyId = trolleyId;
        this.busId = busId;
        this.minibussId = minibussId;
        this.time = time;
    }

    public Clock() {

    }


    public long getClockId() {
        return clockId;
    }

    public void setClockId(long clockId) {
        this.clockId = clockId;
    }

    public long getTramId() {
        return tramId;
    }

    public void setTramId(long tramId) {
        this.tramId = tramId;
    }

    public long getTrolleyId() {
        return trolleyId;
    }

    public void setTrolleyId(long trolleyId) {
        this.trolleyId = trolleyId;
    }

    public long getBusId() {
        return busId;
    }

    public void setBusId(long busId) {
        this.busId = busId;
    }

    public long getMinibussId() {
        return minibussId;
    }

    public void setMinibussId(long minibussId) {
        this.minibussId = minibussId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

