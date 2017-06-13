package com.aire.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class LoopServiceControllerTest {

    public class TestData {
        private String name;

        public TestData(String value) {
            this.name = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

  @Autowired private MockMvc mockMvc;

  @Autowired private TestRestTemplate restTemplate;

  @Autowired private ObjectMapper mapper;

  @Test
  public void getEvents() throws Exception {

    String request = "/events";
    String result = "[\"INCREASE_HIGH_RISK\"]";
    this.mockMvc.perform(get(request)).andDo(print()).andExpect(content().string(result)).andExpect(status().isOk());
  }

  @Test
  public void addApplication() throws Exception {
    TestData testData = new TestData("value");
    String json = mapper.writeValueAsString(testData);
    mockMvc.perform(post("/apps")
              .contentType(MediaType.APPLICATION_JSON)
              .content(json)
              .accept(MediaType.APPLICATION_JSON))
             .andExpect(content().json("[{\"success\":\"true\"}]"))
              .andExpect(status().isCreated());

  }
}
