package com.aire.controller;

import com.aire.service.LoopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController

public class LoopServiceController {

  private static final Logger logger = LoggerFactory.getLogger(LoopServiceController.class);
  @Autowired private LoopService loopService;

  @RequestMapping(
          value = "/apps",
          method = RequestMethod.POST)
  public ResponseEntity<?> addApplication(@RequestBody String payload)
          throws Exception {

    throw new RuntimeException("not implemented");
  }

  @RequestMapping(
          value = "/events",
          method = RequestMethod.GET)
  public ResponseEntity<?> getEvent() {

    System.out.println(loopService.getEvents());
    return ResponseEntity.ok(loopService.getEvents());
  }

}
