package com.aire.service;

import com.aire.model.ApplicationData;
import com.aire.model.Event;
import com.aire.model.EventHolder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LoopService {

  private static int THRESHOLD = 10;

  public LoopService() {}

  List<EventHolder> currentEvents = new ArrayList<EventHolder>();

  public List<EventHolder> getEvents() {
    return currentEvents;
  }

  public void addApplication(List<ApplicationData> testData) {

    int total = testData.size();

    long numberOfItems =
        testData.stream().filter(app -> {
                return app.getDelinq2yrs() == null ? false : Double.valueOf(app.getDelinq2yrs()) > THRESHOLD;
            }).count();

    double percent = Double.valueOf(numberOfItems) / Double.valueOf(total);
    if (percent > 0.2) {
      EventHolder highRisk = new EventHolder(Event.INCREASE_HIGH_RISK, LocalDateTime.now());
      currentEvents.add(highRisk);
    }
  }
}
