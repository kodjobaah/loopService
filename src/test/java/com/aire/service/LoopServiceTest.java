package com.aire.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.aire.Application;
import com.aire.model.ApplicationData;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoopServiceTest {

  private LoopService loopService;

  @Before
  public void setUp() {
    loopService = new LoopService();
  }

  @Test
  public void testForRaiseEvent() {

    int numEventsBefore = loopService.getEvents().size();
    loopService.addApplication(getTestData(3));
    int numEventsAfter = loopService.getEvents().size();
    assertThat(1).isEqualTo(numEventsAfter - numEventsBefore);
  }

  @Test
  public void testForNoRaiseEvent() {

        int numEventsBefore = loopService.getEvents().size();
        loopService.addApplication(getTestData(2));
        int numEventsAfter = loopService.getEvents().size();
        assertThat(numEventsBefore).isEqualTo(numEventsAfter);
  }

    @Test
    public void testForNullValues() {

        List<ApplicationData> testData = new ArrayList<ApplicationData>();
        ApplicationData appData = new ApplicationData();
        testData.add(appData);
        int numEventsBefore = loopService.getEvents().size();
        loopService.addApplication(testData);
        int numEventsAfter = loopService.getEvents().size();
        assertThat(numEventsBefore).isEqualTo(numEventsAfter);
   }

  private List<ApplicationData> getTestData(int percent) {

    List<ApplicationData> applicationData = new ArrayList<ApplicationData>();
    for (int i = 0; i < percent; i++) {
      ApplicationData appData = new ApplicationData();
      appData.setDelinq2yrs(Integer.valueOf(11).toString());
      applicationData.add(appData);
    }

    for (int i = 0; i < (10 - percent); i++) {
      ApplicationData appData = new ApplicationData();
      appData.setDelinq2yrs(Integer.valueOf(0).toString());
      applicationData.add(appData);
    }

    return applicationData;
  }
}
