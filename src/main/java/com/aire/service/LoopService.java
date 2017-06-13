package com.aire.service;

import com.aire.model.Events;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoopService {

  public LoopService() {}

  List<Events> currentEvents;
    {
        currentEvents = new ArrayList<Events>();
        currentEvents.add(Events.INCREASE_HIGH_RISK);
    }

    public List<Events> getEvents() {
            return currentEvents;
    }

}
