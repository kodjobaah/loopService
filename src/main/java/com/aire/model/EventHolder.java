package com.aire.model;

import java.time.LocalDateTime;

public class EventHolder {

  private final Event event;
  private final LocalDateTime occurence;

  public EventHolder(Event event, LocalDateTime occurence) {
    this.event = event;
    this.occurence = occurence;
  }

  public Event getEvent() {
    return event;
  }

  public LocalDateTime getOccurence() {
    return occurence;
  }
}
