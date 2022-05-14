package com.example.demo.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minibuss")
public class Minibus implements Serializable {
    @Id
    @Column(name = "minibussId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long minibussId;
    private long number;
    private String startStation;
    private String endStation;

    public Minibus(long minibussId, long number, String start, String end) {
        this.minibussId = minibussId;
        this.number = number;
        this.startStation = start;
        this.endStation = end;
    }

    public Minibus() {

    }


    public long getMinibussId() {
        return minibussId;
    }

    public void setMinibussId(long minibussId) {
        this.minibussId = minibussId;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }
}
