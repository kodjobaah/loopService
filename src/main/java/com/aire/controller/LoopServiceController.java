package com.aire.controller;

import com.aire.model.ApplicationData;
import com.aire.model.Success;
import com.aire.service.LoopService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoopServiceController {

  private static final Logger logger = LoggerFactory.getLogger(LoopServiceController.class);
  @Autowired private LoopService loopService;

  @RequestMapping(value = "/apps", method = RequestMethod.POST)
  public @ResponseBody Success addApplication(@RequestBody List<ApplicationData> payload)
      throws Exception {

    loopService.addApplication(payload);
    Success success = new Success(payload.size());
    return success;
  }

  @RequestMapping(value = "/events", method = RequestMethod.GET)
  public ResponseEntity<?> getEvent() {

    return ResponseEntity.ok(loopService.getEvents());
  }
}
