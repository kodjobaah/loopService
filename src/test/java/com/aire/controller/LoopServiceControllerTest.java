package com.aire.controller;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.aire.model.Event;
import com.aire.model.EventHolder;
import com.aire.service.LoopService;
import com.aire.utils.TestUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class LoopServiceControllerTest {

  @Autowired private MockMvc mockMvc;

  @Autowired private TestRestTemplate restTemplate;

  @Autowired private ObjectMapper mapper;

  @MockBean private LoopService loopService;

  @Test
  public void getEvents() throws Exception {

    List<EventHolder> currentEvents = new ArrayList<EventHolder>();
    EventHolder highRisk = new EventHolder(Event.INCREASE_HIGH_RISK, LocalDateTime.now());
    currentEvents.add(highRisk);

    given(this.loopService.getEvents()).willReturn(currentEvents);

    String request = "/events";
    this.mockMvc
        .perform(get(request))
        .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].event", is("INCREASE_HIGH_RISK")))
        .andDo(print())
        .andExpect(status().isOk());
  }

  @Test
  public void addApplication() throws Exception {

    String request = TestUtils.getApplications();

    mockMvc
        .perform(
            post("/apps")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(content().json("{\"success\": 10 }"))
        .andExpect(status().isOk());
  }
}
