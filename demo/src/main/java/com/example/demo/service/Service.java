package com.example.demo.service;

import com.example.demo.model.Event;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<Event> eventList = new ArrayList<>();

    public Service(){
        /*Event event = new Event();
        event.setPlace("Rammstein koncert 2023");
        event.setCount(500);
        eventList.add(event);*/
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList( List<Event> eventlist) {
        this.eventList = eventlist;
    }

    public void addEventToList(Event event){
        eventList.add(event);
    }
}
