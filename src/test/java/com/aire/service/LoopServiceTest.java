package com.aire.service;

import com.aire.model.Events;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoopServiceTest {

  private LoopService loopService;


  @Before
  public void setUp() {
    loopService = new LoopService();
  }

  @Test
  public void testGetEvents() {
    List<Events> events = loopService.getEvents();
    assertThat(events).contains(Events.INCREASE_HIGH_RISK);
  }
}
