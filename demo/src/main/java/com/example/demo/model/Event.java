package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name= "event")
public class Event {
    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;
    @Column(name="place")
    private String place;
    @Column(name="count")
    private int count;
    @Column(name="maxPeople")
    private int maxPeopleCount;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public int getMaxPeopleCount() {
        return maxPeopleCount;
    }

    public void setMaxPeopleCount(int maxPeopleCount) {
        this.maxPeopleCount=maxPeopleCount;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", count=" + count +
                ", maxPeopleCount=" + maxPeopleCount +
                '}';
    }
}
